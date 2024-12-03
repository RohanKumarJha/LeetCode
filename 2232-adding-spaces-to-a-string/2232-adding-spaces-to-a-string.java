class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i=0; i<s.length(); i++) {
            if(index < spaces.length) {
                if(i==spaces[index]) {
                sb.append(' ');
                sb.append(s.charAt(i));
                index += 1;
                } else {
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
            }
        } return sb.toString();
    }
}