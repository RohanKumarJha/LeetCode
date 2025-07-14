class Solution {
    public void allSubSets(int[] nums, int index, List<List<Integer>> list, List<Integer> subset) {
        if(index == nums.length) {
            list.add(new ArrayList<>(subset));
            return ;
        }
        subset.add(nums[index]);
        allSubSets(nums, index+1, list, subset);
        subset.remove(subset.size()-1);
        allSubSets(nums, index+1, list, subset);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        allSubSets(nums, 0, list, subset);
        return list;
    }
}