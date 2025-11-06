class Solution {
    private int depth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(depth(root.left),depth(root.right));
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root);
    }
}