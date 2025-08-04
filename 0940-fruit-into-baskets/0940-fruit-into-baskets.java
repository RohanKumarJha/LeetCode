class Solution {
    public int totalFruit(int[] fruits) {
        int len = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();
        int start=0, end=0;
        int result = 0;
        while(end < len) {
            if(map.containsKey(fruits[end])) {
                map.put(fruits[end], map.get(fruits[end])+1);
                end++;
            } else if(!map.containsKey(fruits[end]) && map.size()<2) {
                map.put(fruits[end], 1);
                end++;
            } else {
                result = Math.max(result, end-start);
                map.put(fruits[start], map.get(fruits[start])-1);
                if(map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }
                start++;
            }
        } result = Math.max(result, end-start);
        return result; 
    }
}