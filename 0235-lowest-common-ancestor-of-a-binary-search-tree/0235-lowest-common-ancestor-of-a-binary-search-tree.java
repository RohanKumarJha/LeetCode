class Solution {
    private TreeNode result = null;

    private boolean lowest(TreeNode node,TreeNode p,TreeNode q) {
        if(node == null) return false;
        if(node==p || node==q) {
            result = node;
            return true;
        }
        boolean left = lowest(node.left,p,q);
        boolean right = lowest(node.right,p,q);
        if(left == true && right==true) result = node;
        return left || right;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q) return root;
        lowest(root,p,q);
        return result;
    }
}