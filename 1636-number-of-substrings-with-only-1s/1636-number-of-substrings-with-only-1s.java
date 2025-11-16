class Solution {
    public int numSub(String s) {
        int start=0, end=0;
        int result = 0, count = 0;
        int mod = 1_000_000_007;
        while(end < s.length()) {
            if(s.charAt(end) == '0') {
                start = end+1;
                count = 0;
            } else {
                count++;
                result = (result + count) % mod;
            } 
            end++;
        }
        return result;
    }
}