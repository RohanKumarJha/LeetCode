class Solution {
    public int sum(int n) {
        int ans = 0;
        for(int i=n; i>0; i/=10) {
            ans += (i%10);
        } return ans;
    }
    public int prod(int n) {
        int ans = 1;
        for(int i=n; i>0; i/=10) {
            ans *= (i%10);
        } return ans;
    }
    public int subtractProductAndSum(int n) {
        return prod(n)-sum(n);
    }
}