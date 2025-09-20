class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length-2; i++) {
            int mid=i+1;
            int end=nums.length-1;
            while(mid < end) {
                List<Integer> list = new ArrayList<>();
                int sum = nums[i]+nums[mid]+nums[end];
                if(sum < 0) {
                    mid++;
                } else if(sum == 0) {
                    list.add(nums[i]);
                    list.add(nums[mid]);
                    list.add(nums[end]);
                    set.add(list);
                    mid++; end--;
                } else {
                    end--;
                }
            }
        } return new ArrayList<>(set);
    }
}