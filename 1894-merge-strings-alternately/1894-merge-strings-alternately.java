class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length() == 0) return word2;
        if(word2.length() == 0) return word1;
        StringBuilder sb = new StringBuilder();
        int pos1=0, pos2=0;
        boolean flag = false;
        while(pos1!=word1.length() | pos2!=word2.length()) {
            if(pos1 == word1.length()) {
                sb.append(word2.substring(pos2));
                pos2++;
                break;
            } else if(pos2 == word2.length()) {
                sb.append(word1.substring(pos1));
                pos1++;
                break;
            }
            if(!flag) {
                sb.append(word1.charAt(pos1));
                pos1++;
                flag = true;
            } else {
                sb.append(word2.charAt(pos2));
                pos2++;
                flag = false;
            }
        } return sb.toString();
    }
}