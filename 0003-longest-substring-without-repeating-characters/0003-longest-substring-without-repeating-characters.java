class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSize = 0;
        for(int i=0; i<s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for(int j=i; j<s.length(); j++) {
                if(set.contains(s.charAt(j))) {
                    maxSize = Math.max(maxSize, set.size());
                    break;
                } else {
                    set.add(s.charAt(j));
                }
            } maxSize = Math.max(maxSize, set.size());
        } return maxSize;
    }
}