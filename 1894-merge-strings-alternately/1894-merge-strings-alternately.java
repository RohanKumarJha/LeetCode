class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(i=0; i<ch1.length && i<ch2.length; i++) {
            sb.append(ch1[i]);
            sb.append(ch2[i]);
        }
        if(i == ch1.length) {
            while(i < ch2.length) {
                sb.append(ch2[i]);
                i++;
            }
        }
        if(i == ch2.length) {
            while(i < ch1.length) {
                sb.append(ch1[i]);
                i++;
            }
        } return sb.toString();
    }
} 