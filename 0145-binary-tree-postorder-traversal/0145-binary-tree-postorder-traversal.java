class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = postOrder(root,result);
        return list;
    }

    public List<Integer> postOrder(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
        return list;
    }
}