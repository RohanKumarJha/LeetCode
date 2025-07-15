class Solution {
    private void backtrack(int[] candidates, List<Integer> list, int target, int sum, int index, List<List<Integer>> result) {
        if(sum == target) {
            result.add(new ArrayList<>(list));
            return ;
        }
        if(sum > target || index==candidates.length) return ;
        list.add(candidates[index]);
        backtrack(candidates, list, target, sum+candidates[index], index, result);
        list.remove(list.size()-1);
        backtrack(candidates, list, target, sum, index+1, result);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, new ArrayList<>(), target, 0, 0, result);
        return result;
    }
}