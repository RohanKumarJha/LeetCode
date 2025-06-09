class Solution {

    // Transpose swap (matrix[i][j] <-> matrix[j][i])
    public void swapTranspose(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    // Reverse a row
    public void reverseRow(int[] row) {
        int start = 0, end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[][] matrix) {
        // Step 1: Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                swapTranspose(matrix, i, j);
            }
        }

        // Step 2: Reverse each row
        for (int[] row : matrix) {
            reverseRow(row);
        }
    }
}
