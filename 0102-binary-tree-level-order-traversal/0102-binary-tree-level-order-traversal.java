class Solution {
    public List<List<Integer>> levelOrderTraversal(TreeNode root, Queue<TreeNode> queue, List<List<Integer>> list) {
        while (!queue.isEmpty()) {
            int size = queue.size(); // nodes in this level
            List<Integer> listOneD = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                listOneD.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            list.add(listOneD);
        }
        return list;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return levelOrderTraversal(root, queue, list);
    }
}
