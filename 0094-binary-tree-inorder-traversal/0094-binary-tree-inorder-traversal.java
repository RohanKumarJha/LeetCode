class Solution {
    private void inOrder(TreeNode node, List<Integer> result) {
        if(node == null) return;
        inOrder(node.left,result);
        result.add(node.val);
        inOrder(node.right,result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        inOrder(root,result);
        return result;
    }
}