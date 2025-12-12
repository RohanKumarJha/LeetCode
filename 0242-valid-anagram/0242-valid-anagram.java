class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0; i<ch2.length; i++) {
            if(ch1[i] != ch2[i]) return false;
        }

        return true;
    }
}