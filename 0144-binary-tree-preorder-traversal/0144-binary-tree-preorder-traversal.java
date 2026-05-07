class Solution {
    private List<Integer> preorder(TreeNode node, List<Integer> list) {
        if(node == null) return list;
        list.add(node.val);
        preorder(node.left,list);
        preorder(node.right,list);
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        return preorder(root, new ArrayList<>());
    }
}