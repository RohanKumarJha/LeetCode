class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(st.isEmpty()) {
                if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']') return false;
                else st.push(s.charAt(i));
            } else {
                if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
                    st.push(s.charAt(i));
                } else {
                    if(s.charAt(i)==')') {
                        if(st.peek()=='(') st.pop();
                        else st.push(s.charAt(i));
                    } else if(s.charAt(i)=='}') {
                        if(st.peek()=='{') st.pop();
                        else st.push(s.charAt(i));
                    } else {
                        if(st.peek()=='[') st.pop();
                        else st.push(s.charAt(i));
                    }
                }
            }
        } return (st.size()==0) ? true : false;
    }
}