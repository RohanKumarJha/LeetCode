class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int pointer = k-1;
        while(pointer >= 0) {
            sb.append(s.charAt(pointer));
            pointer--;
        }
        pointer = k;
        while(pointer < s.length()) {
            sb.append(s.charAt(pointer));
            pointer++;
        }
        return sb.toString();
    }
}