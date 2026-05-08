class Solution {
    private List<Integer> list = new ArrayList<>();

    private void inorder(TreeNode node) {
        if(node == null) return ;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return list.get(k-1);
    }
}