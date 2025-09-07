class Solution {
    public List<List<Integer>> zigzag(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(root == null) return resultList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            Stack<TreeNode> stack = new Stack<>();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode temp = queue.poll();
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
                if(level % 2 == 0) {
                    list.add(temp.val);
                } else {
                    stack.add(temp);
                }
            }
            while(!stack.isEmpty()) {
                list.add(stack.pop().val);
            }
            resultList.add(list);
            level++;
        } return resultList;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = zigzag(root);
        return list;
    }
}