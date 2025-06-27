class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        if(word1.length()==0) return word2;
        if(word2.length()==0) return word1;
        int pointer1=0, pointer2=0;
        while(pointer1!=word1.length() && pointer2!=word2.length()) {
            sb.append(word1.charAt(pointer1++));
            sb.append(word2.charAt(pointer2++));
        }
        if(pointer1 != word1.length()) {
            sb.append(word1.substring(pointer1,word1.length()));
        }
        if(pointer2 != word2.length()) {
            sb.append(word2.substring(pointer2,word2.length()));
        } 
        return sb.toString();
    }
}