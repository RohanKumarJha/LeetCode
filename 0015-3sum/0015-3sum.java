class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int start=0;
        Set<List<Integer>> set = new HashSet<>();
        while(start < len-2) {
            int mid = start+1, end=nums.length-1;
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
            } start++;
        } return new ArrayList<>(set);
    }
}