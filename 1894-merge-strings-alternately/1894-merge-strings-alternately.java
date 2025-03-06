class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int idx1=0, idx2=0;
        int len1=word1.length(), len2=word2.length();
        while(idx1!=len1 & idx2!=len2) {
            sb.append(word1.charAt(idx1++));
            sb.append(word2.charAt(idx2++));
        }
        if(idx1 == len1) {
            sb.append(word2.substring(idx2));
        } else {
            sb.append(word1.substring(idx1));
        } return sb.toString();
    }
}