class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        Set<List<Integer>> list = new HashSet<>();
        for(int i=0; i<size-2; i++) {
            List<Integer> newList = new ArrayList<>();
            int start=i+1, end=size-1;
            while(start < end) {
                if(nums[i]+nums[start]+nums[end] == 0) {
                    newList.add(nums[i]);
                    newList.add(nums[start]);
                    newList.add(nums[end]);
                    list.add(newList);
                    newList = new ArrayList<>();
                    start++;
                } else if(nums[i]+nums[start]+nums[end] < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        List<List<Integer>> answer = new ArrayList<>(list);
        return answer;
    }
}