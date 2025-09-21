class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int start=0, end=cleaned.length()-1;
        while(start < end) {
            if(cleaned.charAt(start) != cleaned.charAt(end)) return false;
            start++;
            end--;
        } return true;
    }
}