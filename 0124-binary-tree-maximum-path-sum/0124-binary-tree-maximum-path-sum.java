class Solution {

    private int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return result;
    }

    private int maxPath(TreeNode root) {
        if (root == null) return 0;

        // Negative values are harmful, so clamp with 0
        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));

        // Max path passing THROUGH this node (left + node + right)
        result = Math.max(result, left + right + root.val);

        // Return the best ONE branch extending upward
        return root.val + Math.max(left, right);
    }
}
