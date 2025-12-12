class Solution {
    private boolean isomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) return false;
            } else {
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        return isomorphic(s,t) && isomorphic(t,s);
    }
}