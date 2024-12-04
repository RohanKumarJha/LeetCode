class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int row=a.length, col=a[0].length;
        int s=0, e=col-1;
        while(s<row && e>=0) {
            if(a[s][e] == target) return true;
            else if(a[s][e] < target) s++;
            else e--;
        } return false;
    }
}