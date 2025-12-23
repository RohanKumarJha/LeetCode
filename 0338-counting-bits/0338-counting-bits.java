class Solution {
    private int count(int n,int zeroes) {
        while(n != 0) {
            zeroes += (n % 2);
            n /= 2;
        } return zeroes;
    }
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0; i<=n; i++) {
            result[i] = count(i,0);
        }
        return result;
    }
}