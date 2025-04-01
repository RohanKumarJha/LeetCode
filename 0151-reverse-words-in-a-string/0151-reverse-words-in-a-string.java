class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1; i>=0; i--) {
            str[i] = str[i].trim();
            sb.append(str[i]);
            if(i!=0) sb.append(" ");
        } return new String(sb);
    }
}