class Solution {
    private void combination(int[] candidates, int target, int index, int sum, List<Integer> list, List<List<Integer>> result) {
        if(sum > target || index==candidates.length) return ;
        if(sum == target) {
            result.add(new ArrayList<>(list));
            return ;
        }
        list.add(candidates[index]);
        combination(candidates,target,index,sum+candidates[index],list,result);
        list.remove(list.size()-1);
        combination(candidates,target,index+1,sum,list,result);     
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates,target,0,0,new ArrayList<>(),result);
        return result;
    }
}