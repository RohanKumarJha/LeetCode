class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int result1 = 1;
        int result2 = 2;
        for(int i=3; i<=n; i++) {
            int temp = result2;
            result2 += result1;
            result1 = temp;
        } return result2;
    }
}