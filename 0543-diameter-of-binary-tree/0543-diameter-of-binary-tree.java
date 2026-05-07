class Solution {
    private int result = 0;

    private int diameter(TreeNode root) {
        if(root == null) return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        result = Math.max(result,left+right);
        return 1 + Math.max(left,right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return result;
    }
}