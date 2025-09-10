class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int result = 0;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // check if left child is a leaf
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    result += node.left.val;
                } else {
                    queue.add(node.left);
                }
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return result;
    }
}
