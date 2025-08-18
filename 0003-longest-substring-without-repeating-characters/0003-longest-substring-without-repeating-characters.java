class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = 0;
        for(int i=0; i<s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for(int j=i; j<s.length(); j++) {
                if(set.contains(s.charAt(j))) {
                    break;
                } else {
                    set.add(s.charAt(j));
                    size = Math.max(size, set.size());
                }
            }
        } return size;
    }
}