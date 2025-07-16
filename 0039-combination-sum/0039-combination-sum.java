class Solution {
    public void backTracking(int[] candidates, int target, List<List<Integer>> list, List<Integer> newList, int index, int sum) {
        if(sum > target || index == candidates.length) return ;
        if(sum == target) {
            list.add(new ArrayList<>(newList));
            return ;
        }
        
        newList.add(candidates[index]);
        backTracking(candidates, target, list, newList, index, sum+candidates[index]);
        newList.remove(newList.size()-1);
        backTracking(candidates, target, list, newList, index+1, sum);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        backTracking(candidates, target, list, new ArrayList<>(), 0, 0);
        return list;
    }
}