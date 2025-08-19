class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<p.length(); i++) {
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i),0) + 1);
        }

        int start=0, end=0;
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map2 = new HashMap<>();
        while(end < s.length()) {
            if(end-start == p.length()) {
                map2.put(s.charAt(start), map2.getOrDefault(s.charAt(start),0) - 1);
                if(map2.get(s.charAt(start)) == 0) map2.remove(s.charAt(start));
                start++;
            } else {
                map2.put(s.charAt(end), map2.getOrDefault(s.charAt(end),0) + 1);
                end++;
            }
            if(map.equals(map2)) {
                list.add(start);
            }
        } return list; 
    }
}