class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0, end=matrix.length*matrix[0].length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            int i = mid/matrix[0].length;
            int j = mid%matrix[0].length;
            if(matrix[i][j] == target) {
                return true;
            } else if(matrix[i][j] < target) {
                start++;
            } else {
                end--;
            }
        } return false;
    } 
}