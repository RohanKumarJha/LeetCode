class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int val = 0;
        for(int i=0; i<row; i++) {
            for(int j=val; j<col; j++) {
                if(i!=j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            } val += 1;
        }

        // Reverse the array
        for(int i=0; i<row; i++) {
            int s=0, e=col-1;
            while(s<e) {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
                s++; e--;
            }
        }
    }
}