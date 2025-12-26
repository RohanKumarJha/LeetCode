class Solution {
    private int recur(int n) {
        if(n < 2) return n;
        return recur(n-1) + recur(n-2);
    }

    public int fib(int n) {
        return recur(n);
    }
}