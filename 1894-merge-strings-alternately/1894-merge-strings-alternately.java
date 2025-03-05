class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int pos1=0, pos2=0;
        while(pos1!=word1.length() & pos2!=word2.length()) {
            sb.append(word1.charAt(pos1++));
            sb.append(word2.charAt(pos2++));
        }
        if(pos1==word1.length()) {
            sb.append(word2.substring(pos2));
        }
        if(pos2==word2.length()) {
            sb.append(word1.substring(pos1));
        } return sb.toString();
    }
}