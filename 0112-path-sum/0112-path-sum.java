class Solution {
    private boolean flag = false;

    private void pathSum(TreeNode root, int sum, int targetSum) {
        if (root == null) return;
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                flag = true;
            }
            return;
        }
        pathSum(root.left,sum,targetSum);
        pathSum(root.right,sum,targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        pathSum(root,0,targetSum);
        return flag;
    }
}