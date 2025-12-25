class Solution {
    public int climbStairs(int n) {
        int first = 1;
        if(n == 1) return first;
        int second = 0;
        if(n > 1) second = 2;
        for(int state=3; state<=n; state++) {
            int total = first + second;
            first = second;
            second = total;
        } return second;
    }
}