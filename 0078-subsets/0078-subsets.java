class Solution {
    public void recursiveCall(int[] nums, List<List<Integer>> list, int index, List<Integer> result) {
        // Base case
        if(index == nums.length) {
            list.add(new ArrayList<>(result));
            return ;
        }

        // Add element
        result.add(nums[index]);
        recursiveCall(nums, list, index+1, result);

        // Ignore element
        result.remove(result.size()-1);
        recursiveCall(nums, list, index+1, result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        recursiveCall(nums, list, 0, new ArrayList<>());
        return list;
    }
}