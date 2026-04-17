class Solution {
    private TreeNode search(TreeNode node, int val) {
        if(node == null) return null;
        if(node.val == val) return node;
        return (node.val < val) ? search(node.right, val) : search(node.left, val);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }
}