class Solution {
    public List<Integer> inOrder(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = inOrder(root,result);
        return list;
    }
}