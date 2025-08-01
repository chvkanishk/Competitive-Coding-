class Solution{
    public void rotate(int[][] matrix){
        int n= matrix.length;
        for (int i= 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        for (int i= 0; i<n; i++){
            for (int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][n-1-j];
                matrix[i][n-1-j]= temp;
            }
        }

    }
}

public class rotateimage {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Create Solution instance and rotate the matrix
        Solution sol = new Solution();
        sol.rotate(matrix);

        // Print rotated matrix
        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }

    // Utility method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
        