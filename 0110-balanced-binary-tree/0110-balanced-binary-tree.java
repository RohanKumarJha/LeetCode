class Solution {

    private boolean heightBalance = true;

    private int balance(TreeNode node) {
        if(node == null) return 0;

        int leftSide = balance(node.left);
        int rightSide = balance(node.right);

        if(Math.abs(leftSide-rightSide) > 1) heightBalance=false;

        return 1 + Math.max(leftSide, rightSide);
    } 

    public boolean isBalanced(TreeNode root) {
        balance(root);
        return  heightBalance;
    }
}