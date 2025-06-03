class Solution {
    public void swap(int[][] matrix,int i,int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix.length; j++) {
                if(i!=j) swap(matrix,i,j);
            }
        }
        for(int i=0; i<matrix.length; i++) {
            int start=0, end=matrix.length-1;
            while(start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++; end--;
            }
        }
    }
}