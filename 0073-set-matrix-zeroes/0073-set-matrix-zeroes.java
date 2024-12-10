class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[] rowMat = new int[row];
        int[] colMat = new int[col];
        for(int i=0; i<row; i++) {
            rowMat[i] = 0;
        }
        for(int j=0; j<col; j++) {
            colMat[j] = 0;
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == 0) {
                    rowMat[i] = 1;
                    colMat[j] = 1;
                }
            }
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(rowMat[i]==1 || colMat[j]==1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}