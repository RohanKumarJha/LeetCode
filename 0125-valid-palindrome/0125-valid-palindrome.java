class Solution {
    public boolean isPalindrome(String s) {
        String cleared = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0, end=cleared.length()-1;
        while(start < end) {
            if(cleared.charAt(start) != cleared.charAt(end)) return false;
            start++; 
            end--;
        }
        return true;
    }
}