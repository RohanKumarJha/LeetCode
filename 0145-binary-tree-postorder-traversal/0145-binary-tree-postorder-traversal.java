class Solution {
    public List<Integer> postOrder(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        return postOrder(root, list);
    }
}