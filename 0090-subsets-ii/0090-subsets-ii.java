class Solution {
    public void backtrack(int[] nums,List<List<Integer>> list, List<Integer> newList, int index) {
        if(list.contains(newList)) {
            return ;
        }
        if(index == nums.length) {
            list.add(new ArrayList<>(newList));
            return ;
        }
        newList.add(nums[index]);
        backtrack(nums, list, newList, index+1);
        newList.remove(newList.size()-1);
        backtrack(nums, list, newList, index+1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums, list, new ArrayList<>(), 0);
        return list;
    }
}