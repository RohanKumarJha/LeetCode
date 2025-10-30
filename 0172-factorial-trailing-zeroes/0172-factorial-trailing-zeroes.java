class Solution {
    public int zeroes(int n,int result) {
        if(n<5) return result;
        result += n/5;
        return zeroes(n/5,result);
    }

    public int trailingZeroes(int n) {
        return zeroes(n,0);
    }
}