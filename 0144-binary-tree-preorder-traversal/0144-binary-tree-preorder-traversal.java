class Solution {
    private List<Integer> preorder(TreeNode node, List<Integer> result) {
        if(node == null) return result;
        result.add(node.val);
        preorder(node.left, result);
        preorder(node.right, result);
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return preorder(root, result);
    }
}