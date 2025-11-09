class Solution {
    private void swap(int[][] matrix,int i,int j,int index) {
        int temp = matrix[index][i];
        matrix[index][i] = matrix[index][j];
        matrix[index][j] = temp;
    }

    private void swap(int[][] matrix,int i,int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix.length; j++) {
                swap(matrix,i,j);
            }
        }

        for(int i=0; i<matrix.length; i++) {
            int start=0, end=matrix.length-1;
            while(start < end) {
                swap(matrix,start,end,i);
                start++; end--;
            }
        }
    }
}