class Solution {
    private TreeNode result = null;

    private boolean lowest(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) return false;
        if(node==q || node==p) {
            result = node;
            return true;
        }
        boolean left = lowest(node.left,p,q);
        boolean right = lowest(node.right,p,q);
        if(left==true && right==true) result=node;
        return left || right;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lowest(root,p,q);
        return result;
    }
}