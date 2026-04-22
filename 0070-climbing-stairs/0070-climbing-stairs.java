class Solution {
    private int climbstair(int idx, int n, int first, int second) {
        int total = 0;
        for(int i=idx; i<=n; i++) {
            total = first + second;
            first = second;
            second = total;
        }
        return total;
    }

    public int climbStairs(int n) {
        if(n <= 2) return n;
        int first = 1;
        int second = 2;
        return climbstair(3, n, first, second);
    }
}