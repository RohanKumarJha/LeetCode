class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int pointer1=0, pointer2=0;
        while(pointer1!=word1.length() && pointer2!=word2.length()) {
            sb.append(word1.charAt(pointer1++)).append(word2.charAt(pointer2++));
        }
        if(pointer1 == word1.length()) {
            sb.append(word2.substring(pointer2,word2.length()));
        }
        if(pointer2 == word2.length()) {
            sb.append(word1.substring(pointer1,word1.length()));
        } return sb.toString();
    }
}