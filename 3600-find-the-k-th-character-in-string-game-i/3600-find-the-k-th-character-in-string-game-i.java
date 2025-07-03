class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        StringBuilder sb = new StringBuilder(word);
        while(sb.length() < k) {
            int sbLength = sb.length();
            int count = 0;
            while(sbLength != count) {
                if(sb.charAt(count) == 'z') {
                    sb.append('a');
                } else {
                    sb.append((char)(sb.charAt(count) + 1));
                } count++;
            }
        }
         return sb.charAt(k-1);
    }
}