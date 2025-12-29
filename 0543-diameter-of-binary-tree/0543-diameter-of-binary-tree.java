class Solution {
    private int result = 0;

    private int diameter(TreeNode node) {
        if(node == null) return 0;
        int left = diameter(node.left);
        int right = diameter(node.right);
        result = Math.max(result,left+right);
        return 1 + Math.max(left,right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return result;
    }
}