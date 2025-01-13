class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<len; i++) {
            if(hm.containsKey(target-nums[i])) {
                return new int[]{hm.get(target-nums[i]),i};
            } else {
                hm.put(nums[i],i);
            }
        } return new int[]{};
    }
}