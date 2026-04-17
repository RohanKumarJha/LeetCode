class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int result = 0;
        int start = 0;
        int end = 1;
        for(int i=2; i<=n; i++) {
            result = start + end;
            start = end;
            end = result;
        }
        return result;
    }
}