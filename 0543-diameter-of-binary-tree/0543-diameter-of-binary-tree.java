class Solution {
    private int ans = 0; // global to track maximum diameter

    private int diameter(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);

        // update diameter at this node
        ans = Math.max(ans, leftHeight + rightHeight);

        // return height of current node
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return ans;
    }
}
