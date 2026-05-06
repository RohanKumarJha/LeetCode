class Solution {
    private boolean symmetric(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val != root2.val) return false;
        return symmetric(root1.left, root2.right) & symmetric(root1.right, root2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symmetric(root.left, root.right);
    }
}