class Solution {
    private void inOrder(TreeNode root,List<Integer> list) {
        if(root == null) return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }
}