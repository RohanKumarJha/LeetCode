public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=0; i<32; i++) {
            int lastBit = n&1;
            int newBit = lastBit<<(31-i);
            ans |= newBit;
            n >>= 1;
        } return ans;
    }
}