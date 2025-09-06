class Solution {
    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> listOneD = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode temp = queue.poll();
                listOneD.add(temp.val);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            list.add(listOneD);
        } return list;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        return levelOrderTraversal(root);
    }
}