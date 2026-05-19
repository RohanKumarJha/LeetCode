class Solution {
    int max_Diameter = 0;

    private int diameterOfTree(TreeNode node) {
        if(node == null) return 0;
        int left = diameterOfTree(node.left);
        int right = diameterOfTree(node.right);
        max_Diameter = Math.max(max_Diameter, left+right);
        return 1 + Math.max(left,right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfTree(root);
        return max_Diameter;
    }
}