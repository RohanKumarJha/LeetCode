class Solution {
    List<Integer> list = new ArrayList<>();

    private void inorder(TreeNode node) {
        if(node == null) return ;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return list;
        inorder(root);
        return list;
    }
}