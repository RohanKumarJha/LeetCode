class Solution {
    public void subset(int[] nums,int index,List<Integer> list,List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[index]);
        subset(nums,index+1,list,result);
        list.remove(list.size()-1);
        subset(nums,index+1,list,result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(nums,0,new ArrayList<>(),result);
        return result;
    }
}