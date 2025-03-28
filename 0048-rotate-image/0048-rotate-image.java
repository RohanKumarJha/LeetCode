class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length, col=matrix[0].length;
        for(int i=0; i<row; i++) {
            for(int j=i; j<col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<row; i++) {
            int start=0, end=col-1;
            while(start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++; end--;
            }
        }
    }
}