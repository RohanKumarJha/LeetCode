class Solution {
    private void backTrack(int[] c, List<Integer> comb, int target, int sum, int index, int noOfElement, List<List<Integer>> ans) {
        if(sum == target) {
            ans.add(new ArrayList<>(comb));
            return ;
        }
        if(sum > target || index >= noOfElement) return ;
        comb.add(c[index]);
        backTrack(c, comb, target, sum+c[index], index, noOfElement, ans);
        comb.remove(comb.size()-1);
        backTrack(c, comb, target, sum, index+1, noOfElement, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(candidates, new ArrayList<>(), target, 0, 0, candidates.length, list);
        return list;
    }
}