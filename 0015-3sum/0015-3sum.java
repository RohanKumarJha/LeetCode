class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        Set<List<Integer>> list = new HashSet<>();
        for(int i=0; i<size-2; i++) {
            int start=i+1, end=size-1;
            while(start < end) {
                if(nums[i]+nums[start]+nums[end] == 0) {
                    list.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    end--;
                } else if(nums[i]+nums[start]+nums[end] < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        } return new ArrayList<>(list);
    }
}