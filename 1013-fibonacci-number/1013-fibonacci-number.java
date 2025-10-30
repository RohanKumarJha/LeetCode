class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int result1 = 0;
        int result2 = 1;
        for(int i=2; i<=n; i++) {
            int temp = result2;
            result2 += result1;
            result1 = temp;
        } return result2;
    }
}