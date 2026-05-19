class Solution {
    boolean result = true;

    private int heightBalanced(TreeNode node) {
        if(node == null) return 0;
        int left = heightBalanced(node.left);
        int right = heightBalanced(node.right);
        if(Math.abs(left-right) > 1) {
            result = false;
        }
        return 1 + Math.max(left,right);
    }

    public boolean isBalanced(TreeNode root) {
        heightBalanced(root);
        return result;
    }
}