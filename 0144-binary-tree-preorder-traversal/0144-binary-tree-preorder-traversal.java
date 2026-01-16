class Solution {
    private List<Integer> result = new ArrayList<>();

    public void preorder(TreeNode node) {
        if(node == null) return ;
        result.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return result;
    }
}