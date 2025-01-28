class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length, col=matrix[0].length;
        boolean[] rowMatrix = new boolean[row];
        boolean[] colMatrix = new boolean[col];
        for(int i=0; i<row; i++) {
            rowMatrix[i] = false;
        }
        for(int i=0; i<col; i++) {
            colMatrix[i] = false;
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j]==0) {
                    rowMatrix[i] = true;
                    colMatrix[j] = true;
                }
            }
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(rowMatrix[i]==true | colMatrix[j]==true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}