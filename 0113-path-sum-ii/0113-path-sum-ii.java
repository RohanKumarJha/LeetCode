class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    private void path(TreeNode root, int sum, List<Integer> list, int targetSum) {
        if(root == null) return;
        sum += root.val;
        list.add(root.val);
        if(root.left==null && root.right==null) {
            if(sum == targetSum) {
                result.add(new ArrayList<>(list));
            }
        }
        path(root.left,sum,list,targetSum);
        path(root.right,sum,list,targetSum);
        list.remove(list.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        path(root, 0, new ArrayList<>(), targetSum);
        return result;
    }
}