class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxLength = 0;

        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < len; j++) {
                char c = s.charAt(j);
                if (sb.toString().contains(String.valueOf(c))) {
                    break;
                }
                sb.append(c);
            }
            maxLength = Math.max(maxLength, sb.length());
        }
        return maxLength;
    }
}
