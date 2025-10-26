class Solution {
    public double pow(double x, int n) {
        if(n == 0) return 1.0;
        if(n % 2 == 0) {
            return pow(x*x,n/2);
        }
        if(n % 2 != 0) {
            return x*pow(x*x,n/2);
        } 
        return x;
    }

    public double myPow(double x, int n) {
        return (n < 0) ? 1/pow(x,-n) : pow(x,n);
    }
}