class Solution {
    public Set<List<Integer>> subSet(int[] nums,int index,List<Integer> li,Set<List<Integer>> set) {
        if(index == nums.length) {
            set.add(new ArrayList<>(li));
            return set;
        }
        li.add(nums[index]);
        subSet(nums,index+1,li,set);
        li.remove(li.size()-1);
        subSet(nums,index+1,li,set);
        return set;
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        Set<List<Integer>> result = subSet(nums,0,li,new HashSet<>());
        return new ArrayList<>(result);
    }
}