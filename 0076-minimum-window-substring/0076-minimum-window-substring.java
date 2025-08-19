class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            if (map.containsKey(r)) {
                if (map.get(r) > 0) {
                    required--; // found one useful char
                }
                map.put(r, map.get(r) - 1);
            }
            right++;

            while (required == 0) { // valid window
                if (right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }

                char l = s.charAt(left);
                if (map.containsKey(l)) {
                    map.put(l, map.get(l) + 1);
                    if (map.get(l) > 0) {
                        required++;
                    }
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
