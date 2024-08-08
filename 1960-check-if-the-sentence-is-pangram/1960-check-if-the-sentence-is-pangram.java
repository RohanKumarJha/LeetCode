class Solution {
    public boolean checkIfPangram(String s) {
        Set<Character> alpha = new HashSet<> ();
        for(int i=0; i<s.length(); i++) {
            alpha.add(s.charAt(i));
        }
        if(alpha.size() == 26) {
            return true;
        } else {
            return false;
        }
    }
}