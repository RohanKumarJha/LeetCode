class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int result = 0;
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode temp = queue.poll();
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
                if(i == 0) {
                    result = temp.val;
                }
            }
        } return result;
    }
}