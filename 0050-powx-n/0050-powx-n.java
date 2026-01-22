class Solution {
    public double pow(double x,int n) {
        if(n == 0) return 1.0;
        if(n % 2 == 0) {
            return pow(x*x,n/2);
        } else {
            return x * pow(x*x, n/2);
        }
    }

    public double myPow(double x, int n) {
        if(n<0) return 1.0/pow(x,-n);
        return pow(x,n);
    }
}