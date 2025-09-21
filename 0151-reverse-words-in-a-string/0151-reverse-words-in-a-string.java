class Solution {
    public String reverseWords(String s) {
        boolean flag = false;
        String answer = "";
        int start=0, end=0;
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i)!=' ' && flag==false) {
                end = i;
                flag = true;
            } else if(s.charAt(i)==' ' && flag==true) {
                start = i;
                sb.append(s.substring(start+1,end+1));
                sb.append(" ");
                flag = false;
            }
        } sb.append(s.substring(0,end+1));
        return sb.toString();
    }
}