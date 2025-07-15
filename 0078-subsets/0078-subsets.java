class Solution {
    public void allSubsets(int[] nums, List<List<Integer>> list, List<Integer> newList, int index) {
        if(index == nums.length) {
            list.add(new ArrayList<>(newList));
            return ;
        }
        newList.add(nums[index]);
        allSubsets(nums, list, newList, index+1);
        newList.remove(newList.size()-1);
        allSubsets(nums, list, newList, index+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        allSubsets(nums,list,newList, 0);
        return list;
    }
}