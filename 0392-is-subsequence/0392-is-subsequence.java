class Solution {
    public boolean isSubsequence(String s, String t) {
        int len = t.length();
        int sLen = s.length();
        int idx = 0;
        for(int i=0; i<len; i++) {
            if(idx == sLen) break;
            if(s.charAt(idx) == t.charAt(i)) idx++;
        }
        if(idx == sLen) return true;
        return false;
    }
}