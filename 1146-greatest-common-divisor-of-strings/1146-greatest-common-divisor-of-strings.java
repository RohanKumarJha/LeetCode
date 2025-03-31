class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1.concat(str2).equals(str2.concat(str1)))) return "";
        int pos1 = 0, pos2 = 0;
        for(int i=0; i<str1.length(); i++) {
        // if first string are large
            if(pos2 == str2.length()) pos2=0;
        // if second string are large
            if(pos1 == str1.length() && pos2!=str2.length()) return "";
        // if Both strings are equal
            if(str1.charAt(pos1)!=str2.charAt(pos2)) return "";
        // if string divisible by each other
            if(pos1==str1.length() & pos2==str2.length()) return str2;
            pos1++; pos2++;
        }
        pos1 = str1.length(); pos2=str2.length();
        while(pos1%pos2!=0) {
            int temp = pos1%pos2;
            pos1 = pos2;
            pos2 = temp;
        } 
        return str2.substring(0,pos2);
    }
}