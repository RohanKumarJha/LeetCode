class Solution {
    private TreeNode invert(TreeNode node) {
        if(node == null) return node;
        TreeNode left = invert(node.left);
        TreeNode right = invert(node.right);
        node.left = right;
        node.right = left;
        return node;
    }

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}