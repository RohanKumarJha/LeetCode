class Solution {
    private List<Integer> inorder(TreeNode node, List<Integer> result) {
        if(node == null) {
            return result;
        }
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
        return result;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return inorder(root, result);
    }
}