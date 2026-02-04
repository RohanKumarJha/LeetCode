class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int start=i+1, end=nums.length-1;
            while(start < end) {
                int sum = nums[start]+nums[i]+nums[end];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++; end--;
                } else if(sum < 0) start++;
                else end--;
                while(start<end && start!=i+1 && nums[start]==nums[start-1]) start++;
                while(end<i && end!=nums.length-1 && nums[end]==nums[end+1]) end--;
            }
        }
        return result;
    }
}
