class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int maxSize = 0;
        Set<Character> set = new HashSet<>();
        int end=0;
        while(end < s.length()) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
            }
            maxSize = Math.max(maxSize, set.size());
        } return maxSize;
    }
}