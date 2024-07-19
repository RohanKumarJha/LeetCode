class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int left = 0, right = n-1;
        for(int i=0; i<n; i++) {
            if(left == right) {
                sum += mat[left][left];
            } else {
                sum += (mat[left][left]+mat[left][right]);
            }
            left++;
            right--;
        } return sum;
    }
}