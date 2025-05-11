
import java.util.ArrayList;
import java.util.List;

class Solution{
    public List<Integer> luckynum(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        List<Integer> minrow = new ArrayList<>();
        for (int i =0; i<row; i++){
            int min = Integer.MAX_VALUE;
            for (int j=0;j<col;j++){
                min= Math.min(min, matrix[i][j]);
            } 
            minrow.add(min);
        }
        List<Integer> maxcol = new ArrayList<>();
        for (int i =0; i<col; i++){
            int max = Integer.MIN_VALUE;
            for (int j=0;j<row;j++){
                max= Math.max(max, matrix[j][i]);
            } 
            maxcol.add(max);
        }

        List<Integer> lucky = new ArrayList<>();
        for (int i =0; i<row; i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]==minrow.get(i) && matrix[i][j]==maxcol.get(j)){
                    lucky.add(matrix[i][j]);
                }
            } 
        }
        return lucky;
    }
}



public class luckynumber {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        Solution s = new Solution();
        System.out.println(s.luckynum(matrix));
    }
}
