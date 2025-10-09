class Solution {
    public void subset(int[] nums,int index,List<Integer> list,Set<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        subset(nums,index+1,list,result);
        list.remove(list.size()-1);
        subset(nums,index+1,list,result);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        subset(nums,0,new ArrayList<>(),result);
        List<List<Integer>> answer = new ArrayList<>(result);
        return answer;
    }
}