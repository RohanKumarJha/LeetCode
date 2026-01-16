class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    private void level(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode treenode = q.remove();
                list.add(treenode.val);
                if(treenode.left != null) q.add(treenode.left);
                if(treenode.right != null) q.add(treenode.right);
            }
            result.add(list);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root != null) level(root);
        return result;
    }
}