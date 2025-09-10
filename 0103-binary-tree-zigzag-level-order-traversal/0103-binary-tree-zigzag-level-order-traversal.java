class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode temp = queue.poll();
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
                if(level % 2 == 0) {
                    list.add(temp.val);
                } else {
                    stack.push(temp);
                }
            }
            while(!stack.isEmpty()) {
                list.add(stack.pop().val);
            }
            result.add(list);
            level++;
        } return result;
    }
}