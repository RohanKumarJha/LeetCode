class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    private void subset(int[] nums,int index, List<Integer> list) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        subset(nums,index+1,list);
        list.remove(list.size()-1);
        subset(nums,index+1,list);
    }

    public List<List<Integer>> subsets(int[] nums) {
        subset(nums, 0, new ArrayList<>());
        return result;
    }
}