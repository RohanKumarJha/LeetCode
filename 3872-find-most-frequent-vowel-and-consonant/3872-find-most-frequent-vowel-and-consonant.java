class Solution {
    public int maxFreqSum(String s) {
        int frequencyOfvowel=0, frequencyOfconsonant=0;
        for(int i=0; i<s.length(); i++) {
            int count = 0;           
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)) count++;
            }
            if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
                frequencyOfvowel = Math.max(frequencyOfvowel, count);
            } else {
                frequencyOfconsonant = Math.max(frequencyOfconsonant, count);
            } 
        } return frequencyOfvowel+frequencyOfconsonant;
    }
}