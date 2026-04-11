class Solution {
    private void subset(int[] nums,int idx,List<Integer> list, List<List<Integer>> result) {
        if(idx == nums.length) {
            result.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[idx]);
        subset(nums,idx+1,list,result);
        list.remove(list.size()-1);
        subset(nums,idx+1,list,result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(nums,0,new ArrayList<>(),result);
        return result;
    }
}