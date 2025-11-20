class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++) {
            if(i!=0) {
                nums[i] = nums[i]+nums[i-1];
            }
            if(map.containsKey(nums[i]-k)) {
                result += map.get(nums[i]-k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        } return result;
    }
}