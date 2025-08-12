class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0, end=0; 
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        while(end < s.length()) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            } else {
                set.add(s.charAt(end));
                end++;
            } 
            maxLen = Math.max(maxLen, set.size());
        } return maxLen;
    }
}