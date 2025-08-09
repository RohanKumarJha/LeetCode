class Solution {
    public List<List<Integer>> combination(int[] candidates, int target, int index, List<Integer> li, List<List<Integer>> list, int sum) {
        if(sum>target || index==candidates.length) {
            return list;
        }
        if(sum == target) {
            list.add(new ArrayList<>(li));
            return list;
        }
        li.add(candidates[index]);
        combination(candidates, target, index, li, list, sum+candidates[index]);
        li.remove(li.size()-1);
        combination(candidates, target, index+1, li, list, sum);
        return list;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> result = combination(candidates, target, 0, li, new ArrayList<>(), 0);
        return result;
    }
}