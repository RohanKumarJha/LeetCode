class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    private void subset(int[] nums, int idx, List<Integer> list) {
        if(idx == nums.length) {
            result.add(new ArrayList<>(list));
            return ; 
        }
        list.add(nums[idx]);
        subset(nums, idx+1, list);
        list.remove(list.size()-1);
        subset(nums, idx+1, list);
    }

    public List<List<Integer>> subsets(int[] nums) {
        int idx = 0;
        subset(nums, idx, new ArrayList<>());
        return result;
    }
}