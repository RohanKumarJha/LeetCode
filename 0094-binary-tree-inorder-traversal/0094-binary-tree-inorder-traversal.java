class Solution {
    private List<Integer> result = new ArrayList<>();

    private void inorder(TreeNode node) {
        if(node == null) return ;
        inorder(node.left);
        result.add(node.val);
        inorder(node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return result;
    }
}