class Solution {
    private boolean isBalanced = true;

    private int isBalance(TreeNode node) {
        if(node == null) return 0;

        int left = isBalance(node.left);
        int right = isBalance(node.right);

        if(Math.abs(left-right)>1) {
            isBalanced = false;
        }

        return 1+Math.max(left,right);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        isBalance(root);
        return isBalanced;
    }
}