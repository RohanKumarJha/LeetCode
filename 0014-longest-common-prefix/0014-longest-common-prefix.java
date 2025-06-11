class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int len = Math.min(strs[0].length(),strs[strs.length-1].length());
        for(int i=0; i<len; i++) {
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)) {
                return sb.toString();
            } else {
                sb.append(strs[0].charAt(i));
            }
        } return sb.toString();
    }
}

