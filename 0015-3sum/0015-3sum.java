class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<len-2; i++) {
            int start=i+1, end=len-1;
            while(start < end) {
                List<Integer> list = new ArrayList<>();
                if(nums[i]+nums[start]+nums[end]==0) {
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    if(!set.contains(list)) {
                        set.add(list);
                    } start++; end--;
                } else if(nums[i]+nums[start]+nums[end]<0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        List<List<Integer>> answer = new ArrayList<>(set);
        return answer;
    }
}