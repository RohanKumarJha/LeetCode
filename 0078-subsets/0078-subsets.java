class Solution {
    public void subset(int[] nums,List<Integer> list,List<List<Integer>> result,int index) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[index]);
        subset(nums,list,result,index+1);
        list.remove(list.size()-1);
        subset(nums,list,result,index+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(nums,new ArrayList<>(),result,0);
        return result;
    }
}