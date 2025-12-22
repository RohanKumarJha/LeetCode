class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode node = q.remove();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                if(level % 2 == 0) list.add(node.val);
                else list.add(0,node.val);
            } level++;
            result.add(new ArrayList<>(list));
        } return result;
    }
}