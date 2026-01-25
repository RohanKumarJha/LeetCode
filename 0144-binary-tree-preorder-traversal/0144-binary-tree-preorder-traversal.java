class Solution {
    private List<Integer> list = new ArrayList<>();

    private void preOrder(TreeNode node) {
        if(node == null) return;
        list.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }
}