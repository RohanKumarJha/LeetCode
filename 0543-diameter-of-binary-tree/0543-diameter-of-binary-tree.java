class Solution {
    private int result = 0;

    private int diam(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = diam(root.left);
        int rightHeight = diam(root.right);

        // diameter through current node
        result = Math.max(result, leftHeight + rightHeight);

        // return height of subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diam(root);
        return result;
    }
}
