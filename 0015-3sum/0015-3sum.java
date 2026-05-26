class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int size = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<size-2; i++) {
            int left=i+1, right=size-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(left < right) {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left += 1;
                    right -= 1;
                    while(left<right && nums[left]==nums[left-1]) left += 1;
                    while(left<right && nums[right]==nums[right+1]) right -= 1;
                } else if(sum < 0) {
                    left += 1;
                } else {
                    right -= 1;
                }
            }
        }
        return result;
    }
}