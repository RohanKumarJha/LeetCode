class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        boolean flag = false;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ' && flag==true) {
                st.push(sb.toString());
                sb = new StringBuilder();
                flag = false;
            } else if(s.charAt(i) == ' ' && flag==false) {

            } else {
                sb = sb.append(s.charAt(i));
                flag = true;
            }
        } st.push(sb.toString());
        sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb = sb.append(st.peek());
            st.pop();
            if(!st.isEmpty()) sb.append(" ");
        } return sb.toString();
    }
}