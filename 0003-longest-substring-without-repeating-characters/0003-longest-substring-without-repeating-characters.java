class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size=0, maxSize=0;
        int start=0, end=0;
        Set<Character> set = new HashSet<>();
        while(end < s.length()) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
                size--;
            } else {
                set.add(s.charAt(end));
                end++;
                size++;
            }
            maxSize = Math.max(maxSize,size);
        } return maxSize;
    }
}