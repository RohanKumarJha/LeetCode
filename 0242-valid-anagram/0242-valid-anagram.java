class Solution {
    public static Map<Character, Integer> makeFreqMap(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        } return map;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = makeFreqMap(s);
        for(int i=0; i<t.length(); i++) {
            if(!map.containsKey(t.charAt(i))) return false;
            else {
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
        }
        for(var i : map.values()) {
            if(i!=0) return false;
        } return true;
    }
}