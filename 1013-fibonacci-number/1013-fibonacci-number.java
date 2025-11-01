class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int prev = 0;
        int curr = 1;
        int sum = prev+curr;
        for(int i=2; i<=n; i++) {
            sum = prev+curr;
            prev = curr;
            curr = sum;
        } return sum;
    }
}