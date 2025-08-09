class Solution {
    public boolean isPower(int n) {
        if(n == 1) return true;
        if(n%4 != 0) return false;
        return isPower(n/4);
    }
    public boolean isPowerOfFour(int n) {
        if(n==0 || n==2 || n==3) return false;
        return isPower(n);
    }
}