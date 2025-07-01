class Solution {
    public int possibleStringCount(String word) {
        if(word.length() == 0) return 0;
        int result = 1;
        for(int i=1; i<word.length(); i++) {
            if(word.charAt(i) == word.charAt(i-1)) {
                result += 1;
            }
        } return result;
    }
}