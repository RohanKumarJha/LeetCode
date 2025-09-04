class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> currList = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode saveNode = queue.poll();
                currList.add(saveNode.val);
                if(saveNode.left != null) queue.add(saveNode.left);
                if(saveNode.right != null) queue.add(saveNode.right);
            }
            list.add(currList);
        } return list;
    }
}