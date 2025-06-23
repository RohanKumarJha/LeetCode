class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                if(set.contains(s.charAt(j))) {
                    maxLen = Math.max(maxLen,set.size());
                    set.clear();
                    break;
                } else {
                    set.add(s.charAt(j));
                }
            }
        } return Math.max(set.size(),maxLen);
    }
}