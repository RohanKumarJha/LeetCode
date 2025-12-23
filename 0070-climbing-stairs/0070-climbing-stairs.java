class Solution {
    private int climb(int n) {
        int prev = 1;
        int curr = 2;
        for(int i=2; i<n; i++) {
            int sum = prev+curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    public int climbStairs(int n) {
        if(n <= 2) return n;
        return climb(n);
    }
}