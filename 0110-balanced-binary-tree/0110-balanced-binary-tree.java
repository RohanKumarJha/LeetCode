
class Solution {
    private boolean result = true;

    private int balance(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = balance(node.left);
        int rightHeight = balance(node.right);

        if(Math.abs(leftHeight-rightHeight) > 1) result=false;

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public boolean isBalanced(TreeNode root) {
        balance(root);
        return result;
    }
}