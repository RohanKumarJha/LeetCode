class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arr[i];

            if (!map.containsKey(c)) {
                if (usedWords.contains(word)) return false;
                map.put(c, word);
                usedWords.add(word);
            } else {
                if (!map.get(c).equals(word)) return false;
            }
        }

        return true;
    }
}
