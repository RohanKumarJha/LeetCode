class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            } else {
                map.put(i,1);
            }
        }
        int maxFrequency = 0;
        for(int i : nums) {
            maxFrequency = Math.max(maxFrequency, map.get(i));
        }

        int result = 0;
        for(int i : nums) {
            if(map.containsKey(i)) {
                if(map.get(i) == maxFrequency) {
                    result += map.get(i);
                }
            }
            map.remove(i);
        } return result;
    }
}