class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        int pos = s.length()-1;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i)==' ' && flag==false) {
                sb.append(s.substring(i+1,pos+1));
                sb.append(" ");
                flag = true;
            } else if(s.charAt(i)!=' ' && flag==true) {
                pos = i;
                flag = false;
            }
        } sb.append(s.substring(0,pos+1));
        return sb.toString();
    }
}