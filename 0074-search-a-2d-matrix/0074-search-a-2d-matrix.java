class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int n = row*col;
        int s=0, e=n-1;
        while(s<=e) {
            int mid = (e-s)/2+s;
            if(matrix[mid/col][mid%col] == target) return true;
            else if(matrix[mid/col][mid%col] < target) s=mid+1;
            else e=mid-1;
        } return false;
    }
}