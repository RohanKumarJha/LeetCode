class Solution {
    public void swap(int[][] matrix,int i,int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverse(int[][] matrix,int i,int start,int end) {
        int temp = matrix[i][start];
        matrix[i][start] = matrix[i][end];
        matrix[i][end] = temp;
    }

    public void rotate(int[][] matrix) {

        // swap row-col or vice-versa
        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix[0].length; j++) {
                if(i != j) {
                    swap(matrix,i,j);
                }
            }
        }

        // now reverse the array
        for(int i=0; i<matrix.length; i++) {
            int first = 0;
            int last = matrix[0].length-1;
            while(first < last) {
                reverse(matrix,i,first,last);
                first++;
                last--;
            }
        }
    }
}