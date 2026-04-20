class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    private void subset(int[] nums, int idx, List<Integer> list) {
        if(idx == nums.length) {
            result.add(new ArrayList<>(list));
            return  ;
        }
        list.add(nums[idx]);
        subset(nums, idx+1, list);
        list.remove(list.size()-1);
        subset(nums, idx+1, list);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        subset(nums, 0, list);
        return result;
    }
}