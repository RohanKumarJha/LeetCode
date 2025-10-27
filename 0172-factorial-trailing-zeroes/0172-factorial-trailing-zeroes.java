class Solution {
    public int fact(int n,int result) {
        if(n < 5) return result;
        result += (n/5);
        return fact(n/5,result);
    }

    public int trailingZeroes(int n) {
        int result = 0;
        return fact(n,result);
    }
}