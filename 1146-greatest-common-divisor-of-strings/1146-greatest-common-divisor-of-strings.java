class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1.concat(str2).equals(str2.concat(str1)))) return "";
        int pos1 = 0, pos2 = 0;
        pos1 = str1.length(); pos2=str2.length();
        while(pos1%pos2!=0) {
            int temp = pos1%pos2;
            pos1 = pos2;
            pos2 = temp;
        } 
        return str2.substring(0,pos2);
    }
}