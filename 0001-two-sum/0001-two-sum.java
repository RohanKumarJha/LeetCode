class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(!map.containsKey(target-nums[i])) {
                map.put(nums[i],i);
            } else {
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }
        } return result;
    }
}