class Solution {
    public int gcd(int len1,int len2) {
        while(len1 % len2 != 0) {
            int diff = len1%len2;
            len1 = len2;
            len2 = diff;
        } return len2;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!str1.concat(str2).equals(str2.concat(str1))) return "";
        int len = gcd(str1.length(), str2.length());
        return str2.substring(0,len);
    }
}