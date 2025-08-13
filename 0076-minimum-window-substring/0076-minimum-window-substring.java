class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int start = 0, end = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        int count = t.length();

        while (end < s.length()) {
            char endChar = s.charAt(end);
            if (map.containsKey(endChar)) {
                if (map.get(endChar) > 0) count--;
                map.put(endChar, map.get(endChar) - 1);
            }
            end++;

            while (count == 0) {
                if (end - start < minLength) {
                    minLength = end - start;
                    minStart = start;
                }

                char startChar = s.charAt(start);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0) count++;
                }
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
}
