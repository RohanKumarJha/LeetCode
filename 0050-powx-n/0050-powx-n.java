class Solution {
    public double result(double x, long n) {
        if(n == 0) return 1;
        if(n < 0) return 1.0/result(x,-n);
        if(n % 2 == 0) return result(x*x,n/2);
        else return x*result(x*x,(n-1)/2);
    }
    public double myPow(double x, int n) {
        return result(x, (long)n);
    }
}