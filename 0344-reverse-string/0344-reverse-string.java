class Solution {
    private void swap(char[] s,int start,int end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }

    private void reverseArray(char[] s,int start,int end) {
        if(start >= end) return ;
        swap(s,start,end);
        reverseArray(s,start+1,end-1);
    }

    public void reverseString(char[] s) {
        int start=0, end=s.length-1;
        reverseArray(s,start,end);
    }
}