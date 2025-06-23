class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0, end=0;
        Set<Character> set = new HashSet<>();
        int maxSize = 0;
        while(end < s.length()) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            } else {
                set.add(s.charAt(end++));
                maxSize = Math.max(maxSize,set.size());
            }
        } return maxSize;
    }
}