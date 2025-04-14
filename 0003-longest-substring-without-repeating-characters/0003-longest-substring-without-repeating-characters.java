class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int len = 0;
        for(int i=0; i<s.length(); i++) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                len = Math.max(len,set.size());
                while(set.contains(s.charAt(i))) {
                    set.remove(s.charAt(left));
                    left++;
                } set.add(s.charAt(i));
            }
        } return Math.max(len,set.size());
    }
}