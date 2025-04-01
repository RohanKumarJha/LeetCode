class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(s.length() > t.length()) return false;
        int pos=0;
        for(int i=0; i<t.length(); i++) {
            if(t.charAt(i) == s.charAt(pos)) pos++;
            if(pos == s.length()) return true;
        } return false;
    }
}