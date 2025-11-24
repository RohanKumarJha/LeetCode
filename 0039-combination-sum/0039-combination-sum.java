class Solution {
    private void combination(int[] candidates,int index,int sum,int target,List<Integer> list,List<List<Integer>> result) {
        if(sum == target) {
            result.add(new ArrayList<>(list));
            return ;
        }
        if(sum>target || index==candidates.length) return ;
        sum += candidates[index];
        list.add(candidates[index]);
        combination(candidates,index,sum,target,list,result);
        sum -= candidates[index];
        list.remove(list.size()-1);
        combination(candidates,index+1,sum,target,list,result);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates,0,0,target,new ArrayList<>(),result);
        return result;
    }
}