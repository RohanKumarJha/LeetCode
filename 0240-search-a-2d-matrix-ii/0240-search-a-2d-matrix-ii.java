class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int pointer=0;
        for(int i=0; i<matrix.length; i++) {
            int start=0, end=matrix[0].length-1;
            while(start <= end) {
                int mid = start+(end-start)/2;
                if(matrix[i][mid] == target) {
                    return true;
                } else if(matrix[i][mid] < target) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        } return false;
    }
}