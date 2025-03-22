class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int end=len;
        boolean flag = false;
        for(int i=len-1; i>=0; i--) {
            if(s.charAt(i) == ' ' && flag==false) {
                sb.append(s.substring(i+1,end));
                sb.append(" ");
                flag = true;
                end=i;
            } else if(s.charAt(i)==' ' && flag==true) {
                end = i;
            } else if(s.charAt(i)!=' ' && flag==true) {
                flag = false;
            }
        } 
        sb.append(s.substring(0,end));
        s = sb.toString();
        return s.trim();
    }
}