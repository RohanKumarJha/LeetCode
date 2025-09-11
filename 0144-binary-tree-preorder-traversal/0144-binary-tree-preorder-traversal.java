class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = preOrder(root,result);
        return list;
    }

    public List<Integer> preOrder(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
        return list;
    }
}