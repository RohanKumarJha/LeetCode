class Solution {
    private int fibonacci(int n) {
        if(n < 2) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int fib(int n) {
        return fibonacci(n);
    }
}