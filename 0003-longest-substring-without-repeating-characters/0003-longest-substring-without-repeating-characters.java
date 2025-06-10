class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxSize=0;
        int start=0, end=0;
        while(end < s.length()) {
            if(!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                maxSize = Math.max(maxSize,set.size());
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        } return maxSize;       
    }
}