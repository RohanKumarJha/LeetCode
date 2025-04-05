class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int left = 0;
        int length=0, maxLength=0;
        Set<Character> set = new HashSet<>();

        for(int right=0; right<len; right++) {
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, set.size());
        } return maxLength;
    }
}