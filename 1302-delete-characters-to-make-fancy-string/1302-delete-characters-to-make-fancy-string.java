class Solution {
    public String makeFancyString(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0; i<ch.length; i++) {
            if(i == 0) {
                sb.append(ch[i]);
                count++;
            } else if(ch[i] == ch[i-1]) {
                if(count < 2) {
                    sb.append(ch[i]);
                    count++;
                }
            } else if(ch[i] != ch[i-1]) {
                sb.append(ch[i]);
                count = 1;
            }
        } return sb.toString();
    }
}