class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int len = s.length();
        int count = len;
        boolean flag = true;
        for(int i=len-1; i>=0; i--) {
            if(s.charAt(i)==' ' && flag==true) {
                sb.append(s.substring(i+1,count)).append(' ');
                count = i;
                flag = false;
            } else if(s.charAt(i)==' ' && flag==false) {
                count = i;
            } else {
                flag = true;
            }
        } sb.append(s.substring(0,count));
        return sb.toString();
    }
}