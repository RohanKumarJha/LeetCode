class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length() == 0) return word2;
        if(word2.length() == 0) return word1;
        StringBuilder sb = new StringBuilder();
        char[] chArr1 = word1.toCharArray();
        char[] chArr2  =word2.toCharArray();
        int pos1=0, pos2=0;
        boolean flag = false;
        while(pos1!=word1.length() & pos2!=word2.length()) {
            if(!flag) {
                sb.append(chArr1[pos1++]);
                flag = true;
            } else {
                sb.append(chArr2[pos2++]);
                flag = false;
            }
        }
        while(pos1!=word1.length()) {
            sb.append(chArr1[pos1++]);
        }
        while(pos2!=word2.length()) {
            sb.append(chArr2[pos2++]);
        } return sb.toString();
    }
}