class Solution {
    private TreeNode invert(TreeNode root) {
        if(root == null) return root;
        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}