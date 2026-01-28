class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length, col=matrix[0].length;
        int curr_row = 0, curr_col = col-1;
        while(curr_row<row && curr_col<col && 0<=curr_row && 0<=curr_col) {
            if(matrix[curr_row][curr_col] == target) {
                return true;
            } else if(matrix[curr_row][curr_col] < target) {
                curr_row++;
            } else {
                curr_col--;
            }
        }
        return false;
    }
}