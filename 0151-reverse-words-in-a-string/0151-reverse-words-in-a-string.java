class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int lastIndex = s.length()-1;
        int beginIndex = lastIndex;
        StringBuilder sb = new StringBuilder();
        while(beginIndex >= 0) {
            if(s.charAt(beginIndex) == ' ') {
                if(lastIndex != -1) {
                    sb.append(s.substring(beginIndex+1,lastIndex+1));
                    sb.append(' ');
                    lastIndex = -1;
                }
            } else {
                if(lastIndex == -1) {
                    lastIndex = beginIndex;
                } 
            }
            beginIndex--;
        }
        sb.append(s.substring(0,lastIndex+1));
        return sb.toString();
    }
}