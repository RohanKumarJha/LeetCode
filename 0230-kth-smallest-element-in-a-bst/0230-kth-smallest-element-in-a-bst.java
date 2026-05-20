class Solution {
    private int result = -1;
    private int index = 1;

    private void kth(TreeNode node, int k) {
        if(node == null) return ;
        kth(node.left, k);
        if(index == k) {
            result = node.val;
            index += 1;
            return ;
        }
        index += 1;
        kth(node.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        kth(root, k);
        return result;
    }
}