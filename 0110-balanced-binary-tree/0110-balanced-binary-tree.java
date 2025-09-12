class Solution {
    public int maxHeight(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(maxHeight(root.left),maxHeight(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        if(Math.abs(left-right) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}