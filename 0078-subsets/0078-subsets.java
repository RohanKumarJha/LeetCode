class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    private List<Integer> recur(int[] nums,int index,List<Integer> list) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return list;
        }
        list.add(nums[index]);
        recur(nums,index+1,list);
        list.remove(list.size()-1);
        recur(nums,index+1,list);
        return list;
    }

    public List<List<Integer>> subsets(int[] nums) {
        recur(nums,0,new ArrayList<>());
        return result;
    }
}