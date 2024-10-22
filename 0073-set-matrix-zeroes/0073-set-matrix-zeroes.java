class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[] arr1 = new int[row];
        for(int i=0; i<row; i++) {
            arr1[i] = 0;
        }
        int[] arr2 = new int[col];
        for(int i=0; i<col; i++) {
            arr2[i] = 0;
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j]==0) {
                    arr1[i] = 1;
                    arr2[j] = 1;
                }
            }
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(arr1[i]==1 || arr2[j]==1) matrix[i][j]=0;
            }
        }
    }
}