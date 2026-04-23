class Solution {
    private List<List<Integer>> levelorder(TreeNode node,List<List<Integer>> result) {
        if(node == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode treeNode = q.remove();
                if(treeNode.left != null) {
                    q.add(treeNode.left);
                }
                if(treeNode.right != null) {
                    q.add(treeNode.right);
                }
                list.add(treeNode.val);
            }
            result.add(list);
        }
        return result;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelorder(root, result);
        return result;
    }
}