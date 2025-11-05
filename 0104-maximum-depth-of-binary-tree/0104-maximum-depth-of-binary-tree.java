class Solution {
    private int maxDep(TreeNode node) {
        if(node == null) return 0;
        return 1 + Math.max(maxDep(node.left),maxDepth(node.right));
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return maxDep(root);
    }
}