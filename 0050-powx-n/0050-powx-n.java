class Solution {
    private double pow(double x, int n) {
        if(n == 0) return 1;
        double half = pow(x,n/2);
        return (n % 2 == 0) ? half * half : x * half * half;
    }

    public double myPow(double x, int n) {
        return (n < 0) ? 1/pow(x,-n) : pow(x,n);
    }
}