class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String str = String.valueOf(x);
        int start=0, end=str.length()-1;
        while(start < end) {
            char ch1 = str.charAt(start);
            char ch2 = str.charAt(end);
            if(ch1 != ch2) return false;
            start++; end--;
        }
        return true;
    }
}