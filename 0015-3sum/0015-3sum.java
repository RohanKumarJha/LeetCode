class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int start=0;
        while(start < nums.length-2) {
            if(start!=0 && nums[start]==nums[start-1]) {
                start++;
                continue;
            }
            int mid = start+1, end = nums.length-1;
            while(mid < end) {
                if(mid!=start+1 && nums[mid]==nums[mid-1]) {
                    mid++;
                    continue;
                }
                if(end!=nums.length-1 && nums[end]==nums[end+1]) {
                    end--;
                    continue;
                }
                List<Integer> list = new ArrayList<>();
                int sum = nums[start] + nums[mid] + nums[end];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[start],nums[mid],nums[end]));
                    mid++;  end--;
                } else if(sum < 0) {
                    mid++;
                } else {
                    end--;
                }
            }
            start++;
        }
        return result;
    }
}