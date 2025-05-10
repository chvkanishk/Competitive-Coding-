import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if (i>0){
                List<Integer> prevrow = triangle.get(i-1);
                for(int j=1;j<i;j++){
                    row.add(prevrow.get(j-1) + prevrow.get(j));
                }
                row.add(1);
            }
            triangle.add(row);
        }
        return triangle;
    }  
}


public class pascalstriangle {
    public static void main(String[] args) {
        int numRows = 0;
        
        Solution s= new Solution();
        System.out.println(s.generate(numRows));
    }
}
