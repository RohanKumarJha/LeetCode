import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        int start = 0, end = 0;
        Set<Character> set = new HashSet<>();
        int maxLen = 0;

        while(end < s.length()) {
            if(!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                maxLen = Math.max(maxLen, end - start + 1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;
    }
}
