class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for(int i=0; i<s.length(); i++) {
            List<Character> list = new ArrayList<>();
            int len = 0;
            for(int j=i; j<s.length(); j++) {
                if(!list.contains(s.charAt(j))) {
                    list.add(s.charAt(j));
                    len++;
                } else {
                    break;
                }
            } maxLen = Math.max(maxLen,len);
            list = new ArrayList<>();
        } return maxLen;
    }
}