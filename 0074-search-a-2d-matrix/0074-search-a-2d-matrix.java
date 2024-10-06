class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length, col=matrix[0].length;
        int s=0, e=row*col-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            int rowPos=mid/col, colPos=mid%col;
            if(matrix[rowPos][colPos]==target) return true;
            else if(matrix[rowPos][colPos]<target) s=mid+1;
            else e=mid-1;
        } return false;
    }
}