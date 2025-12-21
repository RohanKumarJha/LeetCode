class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int rowCol = (matrix[0][0] == 0) ? 0 : 1;
        int rowElm = 1;
        int colElm = 1;
        for(int i=0; i<row; i++) {
            if(matrix[i][0] == 0) {
                rowElm = 0;
                break;
            }
        }
        for(int i=0; i<matrix[0].length; i++) {
            if(matrix[0][i] == 0) {
                colElm = 0;
                break;
            }
        }
        for(int i=1; i<matrix.length; i++) {
            for(int j=1; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1; i<matrix.length; i++) {
            for(int j=1; j<matrix[0].length; j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(rowCol == 0) {
            for(int i=0; i<row; i++) {
                matrix[i][0] = 0;
            }
            for(int i=0; i<matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        if(rowElm == 0) {
            for(int i=0; i<row; i++) {
                matrix[i][0] = 0;
            }
        }
        if(colElm == 0) {
            for(int i=0; i<matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}