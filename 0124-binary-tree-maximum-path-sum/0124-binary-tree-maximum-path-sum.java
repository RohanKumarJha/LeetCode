class Solution {
    private int result = Integer.MIN_VALUE;

    private int maxPath(TreeNode node) {
        if(node == null) return 0;
        int left = Math.max(0,maxPath(node.left));
        int right = Math.max(0,maxPath(node.right));
        result = Math.max(result,node.val+left+right);
        return node.val + Math.max(left,right);
    }

    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return result;
    }
}