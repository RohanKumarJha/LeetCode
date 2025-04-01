class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(s.length() > t.length()) return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int pos = 0;
        for(int i=0; i<ch2.length; i++) {
            if(ch2[i] == ch1[pos]) pos++;
            if(pos == ch1.length) return true;
        } return false;
    }
}