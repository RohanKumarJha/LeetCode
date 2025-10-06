class Solution {
    public void combination(int[] candidates,int target,int index,int sum,List<List<Integer>> result, List<Integer> list) {
        if(index==candidates.length || sum>target) return;
        if(sum == target) {
            result.add(new ArrayList<>(list));
            return ;
        }
        list.add(candidates[index]);
        combination(candidates,target,index,sum+candidates[index],result,list);
        list.remove(list.size()-1);
        combination(candidates,target,index+1,sum,result,list);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates,target,0,0,result,new ArrayList<>());
        return result;
    }
}