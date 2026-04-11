class Solution {

    private List<Integer> list = new ArrayList<>();

    private void preorder(TreeNode node) {
        if(node == null) return ;
        list.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }
}