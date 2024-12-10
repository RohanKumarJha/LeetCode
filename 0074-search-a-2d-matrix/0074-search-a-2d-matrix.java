class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int row = m.length;
        int col = m[0].length;
        int s=0, e=row*col-1;
        while(s <= e) {
            int mid = (e-s)/2+s;
            if(m[mid/col][mid%col] == target) return true;
            else if(m[mid/col][mid%col] < target) s=mid+1;
            else e=mid-1;
        } return false;
    }
}