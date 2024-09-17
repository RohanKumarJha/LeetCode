class Solution {
    public static int half(String s,int i,int n) {
        int count = 0;
        for(int num=i; num<n; num++) {
            if(s.charAt(num)=='a'| s.charAt(num)=='e'| s.charAt(num)=='i'| s.charAt(num)=='o'| s.charAt(num)=='u'| s.charAt(num)=='A'| s.charAt(num)=='E'| s.charAt(num)=='I'| s.charAt(num)=='O'| s.charAt(num)=='U') {
                count++;
            }
        } return count;
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int firstHalf = half(s,0,n/2);
        int secondHalf = half(s,n/2,n);
        if(firstHalf == secondHalf) return true;
        return false;
    }
}