class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 0;
        if(n > 1) second = 2;
        for(int i=2; i<=n; i++) {
            int curr = first+second;
            first = second;
            second = curr;
        }
        return first;
    }
}