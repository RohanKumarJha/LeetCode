class Solution {
    public void recursiveCall(int[] nums,List<List<Integer>> list, int index, List<Integer> result) {
        if(list.contains(result)) return;

        // Base case
        if(index == nums.length) {
            list.add(new ArrayList<>(result));
            return ;
        }

        // digit contains
        result.add(nums[index]);
        recursiveCall(nums, list, index+1, result);

        // digit not contains
        result.remove(result.size()-1);
        recursiveCall(nums, list, index+1, result);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        recursiveCall(nums, list, 0, new ArrayList<>());
        return list;
    }
}