class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        int pointer1=0, pointer2=0;
        while(pointer2 < t.length()) {
            if(pointer1 == s.length()) return true;
            if(s.charAt(pointer1) == t.charAt(pointer2)) {
                pointer1++;
            } pointer2++;
        }
        return (pointer1 == s.length()) ? true : false;
    }
}