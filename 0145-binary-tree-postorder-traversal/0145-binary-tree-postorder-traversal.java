class Solution {
    List<Integer> list = new ArrayList<>();

    private void postorder(TreeNode node) {
        if(node == null) return ;
        postorder(node.left);
        postorder(node.right);
        list.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return list;
        postorder(root);
        return list;
    }
}