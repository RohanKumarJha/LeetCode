class Solution {
    public int hammingWeight(int n) {
        int val = 0;
        while(n != 0) {
            if((n&1)==1) val++;
            n >>= 1;
        } return val;
    }
}