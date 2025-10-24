class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start=0, end=0;
        int result = 0;
        while(end < s.length()) {
            if(set.contains(s.charAt(end))) {
                result = Math.max(set.size(),result);
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
            }
        } result = Math.max(set.size(),result);
        return result;
    }
}