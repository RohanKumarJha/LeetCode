class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxSize = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                if(set.contains(s.charAt(j))) {
                    maxSize = Math.max(maxSize, set.size());
                    set.clear();
                    break;
                } else {
                    set.add(s.charAt(j));
                }
            }
        } return Math.max(set.size(), maxSize);
    }
}