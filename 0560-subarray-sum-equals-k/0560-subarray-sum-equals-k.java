class Solution {
    public int subarraySum(int[] nums, int k) {
        int size = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0;
        int sum = 0;
        for(int i=0; i<size; i++) {
            sum += nums[i];
            if(map.containsKey(sum-k)) {
                result += map.get(sum-k);
            }
            if(map.containsKey(sum)) {
                map.put(sum,map.get(sum)+1);
            } else {
                map.put(sum,1);
            }
        }
        return result;
    }
}