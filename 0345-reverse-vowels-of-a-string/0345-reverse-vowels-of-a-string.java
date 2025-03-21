class Solution {
    public void swap(char[] arr,int start,int end) {
        char ch = arr[start];
        arr[start] = arr[end];
        arr[end] = ch;
    }

    public boolean isVowel(char ch) {
        return (ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch=='u' | ch=='A' | ch=='E' | ch=='I' | ch=='O' | ch=='U') ? true : false;
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start=0, end=arr.length-1;
        while(start < end) {
            if(!isVowel(arr[start])) start++;
            if(!isVowel(arr[end])) end--;
            if(isVowel(arr[start]) & isVowel(arr[end])) {
                swap(arr,start,end);
                start++; end--;
            }
        } String str = new String(arr);
        return str;
    }
}