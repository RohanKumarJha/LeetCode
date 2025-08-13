class Solution {
    public boolean recursion(int n) {
        if(n == 0) return false;
        if(n==1) return true;
        if(n % 3 != 0) return false;
        return recursion(n/3);
    }

    public boolean isPowerOfThree(int n) {
        return recursion(n);
    }
}