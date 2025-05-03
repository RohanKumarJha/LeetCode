class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                st.push(s.charAt(i));
            } else if(st.isEmpty()) {
                if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']') {
                    return false;
                }
            } else {
                if(s.charAt(i)==')' && st.peek()=='(' && i>0) {
                    st.pop();
                } else if(s.charAt(i)=='}' && st.peek()=='{' && i>0) {
                    st.pop();
                } else if(s.charAt(i)==']' && st.peek()=='[' && i>0) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return (st.isEmpty()) ? true : false;
    }
}