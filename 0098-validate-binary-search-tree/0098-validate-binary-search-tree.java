class Solution {

    private long prev = Long.MIN_VALUE;

    private boolean inorder(TreeNode node) {
        if(node == null) return true;

        if(!inorder(node.left)) return false;

        if(node.val <= prev) {
            return false;
        }

        prev = node.val;

        return inorder(node.right);
    }

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }
}