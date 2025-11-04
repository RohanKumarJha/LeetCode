class Solution {
    public void permut(int[] nums,int index,List<Integer> list,List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0; i<nums.length; i++) {
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            permut(nums,index+1,list,result);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permut(nums,0,new ArrayList<>(),result);
        return result;
    }
}