class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            StringBuilder sb = new StringBuilder(strs[i]);
            char[] chars = sb.toString().toCharArray();
            Arrays.sort(chars);
            String check = new String(chars);
            if (map.containsKey(check)) {
                map.get(check).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(check, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(int i=0; i<strs.length; i++) {
            StringBuilder sb = new StringBuilder(strs[i]);
            char[] chars = sb.toString().toCharArray();
            Arrays.sort(chars);
            String check = new String(chars);
            if (map.containsKey(check)) {
                List<String> list = map.get(check);
                result.add(list);
                map.remove(check);
            }
        } return result;
    }
}