class Solution {
    public List<List<Integer>> subset(int[] nums,int index,List<Integer> list,List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return result;
        }
        list.add(nums[index]);
        subset(nums,index+1,list,result);
        list.remove(list.size()-1);
        subset(nums,index+1,list,result);
        return result;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> list = subset(nums,0,new ArrayList<>(),result);
        return list;        
    }
}