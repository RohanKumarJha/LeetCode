class Solution {
    private int depth(TreeNode node) {
        if(node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        return 1 + Math.max(left,right);
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root);
    }
}