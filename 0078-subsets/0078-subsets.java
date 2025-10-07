class Solution {
    public List<List<Integer>> findAllSubsets(int[] nums,int index,List<Integer> list,List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return result;
        } 
        list.add(nums[index]);
        findAllSubsets(nums,index+1,list,result);
        list.remove(list.size()-1);
        findAllSubsets(nums,index+1,list,result);
        return result;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        return findAllSubsets(nums,0,new ArrayList<>(),result);
    }
}