class Solution {

    public List<Integer> postorder(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = postorder(root, list);
        return result;
    }
}