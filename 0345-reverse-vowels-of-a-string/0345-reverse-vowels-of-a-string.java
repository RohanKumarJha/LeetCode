class Solution {
    public void swap(StringBuilder sb,int start,int end) {
        char ch = sb.charAt(start);
        sb.setCharAt(start,sb.charAt(end));
        sb.setCharAt(end,ch);
    }

    public boolean isVowel(char ch) {
        return (ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch=='u' | ch=='A' | ch=='E' | ch=='I' | ch=='O' | ch=='U') ? true : false;
    }

    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start=0, end=s.length()-1;
        while(start < end) {
            if(!isVowel(s.charAt(start))) start++;
            if(!isVowel(s.charAt(end))) end--;
            if(isVowel(s.charAt(start)) & isVowel(s.charAt(end))) {
                swap(sb,start,end);
                start++; end--;
            }
        } return sb.toString();
    }
}