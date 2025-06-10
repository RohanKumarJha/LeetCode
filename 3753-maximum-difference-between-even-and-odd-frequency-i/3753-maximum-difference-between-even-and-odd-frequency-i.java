class Solution {
    public int maxDifference(String s) {
        int[] alphabet = new int[26];
        for(int i=0; i<s.length(); i++) {
            alphabet[s.charAt(i)-'a']++;
        }

        int even=Integer.MAX_VALUE, odd=Integer.MIN_VALUE;
        for(int i=0; i<26; i++) {
            if(alphabet[i] != 0) {
                if(alphabet[i] % 2 == 0) {
                    even = Math.min(even, alphabet[i]);
                } else {
                    odd = Math.max(odd, alphabet[i]);
                }
            }
        } return odd-even;
    }
}