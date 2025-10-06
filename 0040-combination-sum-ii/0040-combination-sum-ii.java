class Solution {
    public void combination(int[] candidates, int target,int index,int sum,Set<List<Integer>> result, List<Integer> list) {
        if(sum == target) {
            result.add(new ArrayList<>(list));
            return ;
        }
        if(sum>target || index==candidates.length) return;
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            list.add(candidates[i]);
            combination(candidates, target, i + 1, sum + candidates[i], result, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> result = new HashSet<>();
        combination(candidates,target,0,0,result,new ArrayList<>());
        List<List<Integer>> answer = new ArrayList<>(result);
        return answer;
    }
}