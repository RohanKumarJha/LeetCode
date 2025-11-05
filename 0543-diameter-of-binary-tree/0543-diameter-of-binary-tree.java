class Solution {
    private int result = 0;

    private int diameter(TreeNode node) {
        if(node == null) return 0;
        
        int leftSide = diameter(node.left);
        int rightSide = diameter(node.right);

        result = Math.max(result, leftSide + rightSide);

        return 1 + Math.max(leftSide, rightSide);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return result;
    }
}