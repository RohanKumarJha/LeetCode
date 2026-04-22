class Solution {
    private int fibonacci(int idx, int n, int first, int second) {
        int result = 0;
        for(int i=idx; i<=n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public int fib(int n) {
        if(n < 2) return n;
        int first = 0;
        int second = 1;
        return fibonacci(2, n, first, second);
    }
}