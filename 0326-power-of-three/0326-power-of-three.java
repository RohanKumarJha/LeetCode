class Solution {
    public boolean isPower(int n) {
        if(n == 1) return true;
        if(n % 3 != 0) return false;
        return isPower(n/3);
    }

    public boolean isPowerOfThree(int n) {
        if(n==0 || n==2) return false;
        return isPower(n);
    }
}