class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int start=0, end=0;
        int totalSize = s1.length();
        Map<Character, Integer> map2 = new HashMap<>();
        while(end < s2.length()) {
            if(totalSize == 0) {
                map2.put(s2.charAt(start), map2.get(s2.charAt(start))-1);
                if(map2.get(s2.charAt(start)) == 0) {
                    map2.remove(s2.charAt(start));
                } totalSize++;
                start++;
            } else {
                map2.put(s2.charAt(end), map2.getOrDefault(s2.charAt(end),0) + 1);
                totalSize--;
                end++;
            }
            if(map.equals(map2)) return true;
        } return false;
    }
}