class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {
            Stack<TreeNode> stack = new Stack<>();
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
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
                list.add(stack.peek().val);
                stack.pop();
            } result.add(list);
            level++;
        } return result;
    }
}