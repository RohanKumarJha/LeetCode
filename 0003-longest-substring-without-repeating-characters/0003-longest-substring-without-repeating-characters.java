class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, right=0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
            char ch = s.charAt(right);
            if(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(ch);
                right++;
            }
            result = Math.max(result,right-left);
        }
        return result;
    }
}