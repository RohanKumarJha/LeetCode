class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int start=0; start<len; start++) {
            int mid = start+1, end=nums.length-1;
            if(nums[start] > 0) break;
            if(start > 0 && nums[start-1] == nums[start]) continue;
            while(mid < end) {
                if(nums[start]+nums[mid]+nums[end] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[start]);
                    list.add(nums[mid]);
                    list.add(nums[end]);
                    set.add(list);
                    mid++; end--;
                } else if(nums[start]+nums[mid]+nums[end] < 0) {
                    mid++;
                } else {
                    end--;
                }
            }
        } return new ArrayList<>(set);
    }
}