class Solution {
    public int height(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public boolean balance(TreeNode root) {
        if(root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right) > 1) return false;
        return balance(root.left) && balance(root.right);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return balance(root);
    }
}