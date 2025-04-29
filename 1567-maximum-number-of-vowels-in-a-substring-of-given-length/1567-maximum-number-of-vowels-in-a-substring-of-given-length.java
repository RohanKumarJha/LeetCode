class Solution {
    public boolean isVowel(char ch) {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }

    public int maxVowels(String s, int k) {
        int noOfVowel = 0;
        int result = 0;
        for(int i=0; i<k; i++) {
            if(isVowel(s.charAt(i))) {
                noOfVowel++;
            }
        } result = Math.max(result,noOfVowel);
        int initial = 0;
        for(int i=k; i<s.length(); i++) {
            if(!isVowel(s.charAt(i)) && isVowel(s.charAt(initial))) {
                noOfVowel--;
                result = Math.max(result,noOfVowel);
            } else if(isVowel(s.charAt(i)) && !isVowel(s.charAt(initial))) {
                noOfVowel++;
                result = Math.max(result,noOfVowel);
            } initial++;
        } return result;
    }
}