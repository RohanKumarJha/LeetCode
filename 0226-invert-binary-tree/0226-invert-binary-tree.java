class Solution {
    private void invertTreeNode(TreeNode node) {
        if(node == null) return ;
        TreeNode temp1 = node.left;
        TreeNode temp2 = node.right;
        node.left = temp2;
        node.right = temp1;
        invertTreeNode(node.left);
        invertTreeNode(node.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        invertTreeNode(root);
        return root;
    }
}