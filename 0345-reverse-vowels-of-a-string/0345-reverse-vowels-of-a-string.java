class Solution {
    public void swap(char[] ch,int start,int end) {
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
    }

    public boolean allVowels(char ch) {
        return (ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch=='u' | ch=='A' | ch=='E' | ch=='I' | ch=='O' | ch=='U');
    }

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start=0, end=s.length()-1;
        while(start < end) {
            if(allVowels(ch[start]) & allVowels(ch[end])) {
                swap(ch,start,end);
                start++; end--;
            } else if(allVowels(ch[start])) {
                end--;
            } else if(allVowels(ch[end])) {
                start++;
            } else {
                start++; end--;
            }
        }  return new String(ch);
    }
}