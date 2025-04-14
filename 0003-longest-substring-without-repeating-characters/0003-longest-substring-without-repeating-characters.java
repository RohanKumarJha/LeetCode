class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        List<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                if(!list.contains(s.charAt(j))) {
                    list.add(s.charAt(j));
                } else {
                    break;
                }
            } 
            if(len < list.size()) len=list.size();
            list = new ArrayList<>();
        } return len;
    }
}