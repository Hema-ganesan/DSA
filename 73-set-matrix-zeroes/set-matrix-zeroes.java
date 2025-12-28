class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rows1 = new boolean[rows];
        boolean[] cols1 = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rows1[i] = true;
                    cols1[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rows1[i] || cols1[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}