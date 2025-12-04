class Solution {

    private void swap(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    private void invert(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            swap(temp);
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        invert(root);
        return root;
    }
}