class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()) {
            int size = qu.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode node = qu.remove();
                if(node.left != null) qu.add(node.left);
                if(node.right != null) qu.add(node.right);
                list.add(node.val);
            }
            result.add(list);
        }

        return result;
    }
}