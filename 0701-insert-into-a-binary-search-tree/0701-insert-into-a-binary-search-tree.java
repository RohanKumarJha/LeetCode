class Solution {
    private void insert(TreeNode root, TreeNode node, int val) {
        if(root.val < val) {
            if(root.right == null) {
                root.right = node;
                return ;
            } insert(root.right, node, val);
        } else {
            if(root.left == null) {
                root.left = node;
                return ;
            } insert(root.left, node, val);
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if(root == null) {
            return node;
        }
        insert(root, node, val);
        return root;
    }
}