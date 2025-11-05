class Solution {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int pos1 = 1;
        int pos2 = 2;
        int result = 0;
        for(int i=3; i<=n; i++) {
            result = pos1 + pos2;
            pos1 = pos2;
            pos2 = result;
        } return result;
    }
}