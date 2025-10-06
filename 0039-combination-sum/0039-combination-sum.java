class Solution {
    public void combination(int[] candidates,List<List<Integer>> result,int index,int sum,int target,List<Integer> list) {
        if(sum > target || index==candidates.length) {
            return ;
        }
        if(sum == target) {
            result.add(new ArrayList<>(list));
            return ;
        }
        list.add(candidates[index]);
        combination(candidates,result,index,sum+candidates[index],target,list);
        list.remove(list.size()-1);
        combination(candidates,result,index+1,sum,target,list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates,result,0,0,target,new ArrayList<>());
        return result;
    }
}