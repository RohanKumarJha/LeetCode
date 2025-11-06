class Solution {
    private void inOrder(TreeNode root,List<Integer> result) {
        if(root.left != null) inOrder(root.left,result);
        result.add(root.val);
        if(root.right != null) inOrder(root.right,result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        inOrder(root,result);
        return result;
    }
}