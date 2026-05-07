class Solution {
    private boolean flag = true;

    private int balance(TreeNode node) {
        if(node == null) return 0;
        int left = balance(node.left);
        int right = balance(node.right);
        if(Math.abs(left-right) > 1) {
            flag = false;
        }
        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        balance(root);
        return flag;
    }
}