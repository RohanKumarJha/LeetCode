class Solution {
    private boolean result = true;

    private int isBalance(TreeNode node) {
        if(node == null) return 0;
        int left = isBalance(node.left);
        int right = isBalance(node.right);
        if(Math.abs(left-right) > 1) {
            result = false;
        }
        return 1 + Math.max(left,right);
    }

    public boolean isBalanced(TreeNode root) {
        isBalance(root);
        return result;
    }
}