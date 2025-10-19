class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0, end=0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        while(end < s.length()) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
            } result = Math.max(result,set.size());
        } return result;
    }
}