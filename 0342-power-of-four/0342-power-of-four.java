class Solution {
    public boolean power(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        if(n % 4 == 0) {
            return power(n/4);
        } return false;
    }

    public boolean isPowerOfFour(int n) {
        return power(n);
    }
}