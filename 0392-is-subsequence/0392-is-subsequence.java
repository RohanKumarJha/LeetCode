class Solution {
    public boolean isSubsequence(String s, String t) {
        int start = 0;
        int pointer = 0;
        if(s.length() == 0) return true;
        while(start < t.length()) {
            if(s.charAt(pointer) == t.charAt(start)) {
                pointer++;
                if(pointer == s.length()) return true;
            } start++;
        } return pointer==s.length();
    }
}