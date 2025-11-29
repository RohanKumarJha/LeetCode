class Solution {
    private void combination(int[] candidates,int index,int sum,int target,List<Integer> list,List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (index == candidates.length || sum > target) return;
        list.add(candidates[index]);
        combination(candidates, index + 1, sum + candidates[index], target, list, result);
        list.remove(list.size() - 1);
        index = index + 1;
        while (index < candidates.length && candidates[index] == candidates[index-1]) {
            index++;
        }
        combination(candidates, index, sum, target, list, result);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates, 0, 0, target, new ArrayList<>(), result);
        return result;
    }
}