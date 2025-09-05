class Solution {
    public static int height(TreeNode root) {
        if(root == null) return -1;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static Boolean balance(TreeNode root) {
        if(root == null) return true;
        int leftHeight = height(root.left);
        int rigHeight = height(root.right);
        if(Math.abs(leftHeight-rigHeight) > 1) return false;
        return balance(root.left) && balance(root.right);
    }

    public boolean isBalanced(TreeNode root) {
        Boolean balanceTree = balance(root);
        return balanceTree;
    }
}