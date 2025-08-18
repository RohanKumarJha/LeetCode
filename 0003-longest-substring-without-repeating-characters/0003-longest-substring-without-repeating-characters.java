class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size=0;
        Set<Character> set = new HashSet<>();
        int start=0, end=0;
        while(end < s.length()) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                size = Math.max(size, set.size());
                end++;
            }
        } return Math.max(size, set.size());
    }
}