class Solution {
    private boolean checksymmetric(TreeNode left,TreeNode right) {
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.val != right.val) return false;
        return checksymmetric(left.left,right.right) && checksymmetric(left.right,right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checksymmetric(root.left,root.right);
    }
}