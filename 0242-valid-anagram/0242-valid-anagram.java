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
        Map<Character, Integer> map1 = makeFreqMap(s);
        Map<Character, Integer> map2 = makeFreqMap(t);
        return map1.equals(map2);
    }
}