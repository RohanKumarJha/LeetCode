class Solution {
    private int result = 0;

    private int diameter(TreeNode node) {
        if(node == null) return 0;

        int leftNode = diameter(node.left);
        int rightNode = diameter(node.right);

        result = Math.max(result,leftNode+rightNode);

        return 1 + Math.max(leftNode, rightNode);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return result;
    }
}