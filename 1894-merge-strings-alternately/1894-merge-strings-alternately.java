class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length(), len2=word2.length();
        if(len1 == 0) return word2;
        if(len2 == 0) return word1;
        int pos1=0, pos2=0;
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        while(pos1!=len1 || pos2!=len2) {
            if(pos1 != len1 & flag==false) {
                sb.append(word1.charAt(pos1++));
                flag = true;
            } else if(pos2 != len2 & flag==true) {
                sb.append(word2.charAt(pos2++));
                flag = false;
            } else if(pos1 == len1) {
                sb.append(word2.substring(pos2));
                pos2 = len2;
            } else if(pos2 == len2) {
                sb.append(word1.substring(pos1));
                pos1 = len1;
            }
        } return sb.toString();
    }
}