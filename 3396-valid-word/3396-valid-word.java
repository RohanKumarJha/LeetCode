class Solution {
    public boolean isValid(String word) {
        String regex = "^(?=.*[aeiouAEIOU])(?=.*[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z])[A-Za-z0-9]+$";
        return word.length() >= 3 && word.matches(regex);
    }
}
