class Solution {
    private boolean power(int n) {
        if(n == 1) return true;
        if(n % 2 != 0) return false;
        return power(n/2);
    }

    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        return power(n);
    }
}