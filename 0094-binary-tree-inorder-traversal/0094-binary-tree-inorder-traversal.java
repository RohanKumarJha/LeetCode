class Solution {
    public List<Integer> inorder(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inorder(root, list);
    }
}