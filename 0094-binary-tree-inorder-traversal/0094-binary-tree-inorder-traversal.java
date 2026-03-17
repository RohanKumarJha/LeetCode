class Solution {
    private List<Integer> list = new ArrayList<>();

    private void inorder(TreeNode node) {
        if(node == null) return ;
        if(node.left != null) inorder(node.left);
        list.add(node.val);
        if(node.right != null) inorder(node.right);
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }
}