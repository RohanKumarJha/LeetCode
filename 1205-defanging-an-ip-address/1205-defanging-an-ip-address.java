class Solution {
    public String defangIPaddr(String address) {
        int n = address.length();
        StringBuilder sb = new StringBuilder();
        char ch;
        for(int i=0; i<n; i++) {
            ch = address.charAt(i);
            if(ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        } return sb.toString();
    }
}