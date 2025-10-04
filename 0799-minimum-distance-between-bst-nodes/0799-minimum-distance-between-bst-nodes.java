class Solution {
    private Integer minDiff = Integer.MAX_VALUE;
    private Integer prev = null;

    private void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        if(prev != null) {
            minDiff = Math.min(minDiff,root.val-prev);
        } prev = root.val;
        inorder(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDiff;
    }
}