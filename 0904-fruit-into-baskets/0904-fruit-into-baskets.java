class Solution {
    public int totalFruit(int[] fruits) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int start=0, end=0;
        while(end < fruits.length) {
            if(map.containsKey(fruits[end])) {
                map.put(fruits[end],map.get(fruits[end])+1);
                end++;
            } else {
                if(map.size() < 2) {
                    map.put(fruits[end],1);
                    end++;
                } else {
                    result = Math.max(result,end-start);
                    if(map.get(fruits[start]) == 1) {
                        map.remove(fruits[start]);
                    } else {
                        map.put(fruits[start],map.get(fruits[start])-1);
                    } start++;
                }
            }
        } result = Math.max(result,end-start);
        return result;
    }
}