class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int size = s.length();
        int i = s.length()-1;
        while(i >= 0) {
            if(s.charAt(i) == ' ') return size-i-1;
            i--;
        }
        return size;
    }
}