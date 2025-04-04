class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length, col=matrix[0].length;
        int len = row*col;
        int start=0, end=len-1;
        while(start <= end) {
            int mid = end-(end-start)/2;
            if(matrix[mid/col][mid%col] == target) {
                return true;
            } else if(matrix[mid/col][mid%col] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        } return false;
    }
}