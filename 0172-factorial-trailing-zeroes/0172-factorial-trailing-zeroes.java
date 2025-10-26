class Solution {
    public int trailing(int n,int result) {
        if(n < 5) return result;
        result += (n/5);
        return trailing(n/5, result);
    }

    public int trailingZeroes(int n) {
        int result = 0;
        return trailing(n,result);
    }
}