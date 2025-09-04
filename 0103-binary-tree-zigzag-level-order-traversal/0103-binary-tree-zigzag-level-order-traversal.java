class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {
            List<Integer> currList = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode saveNode = queue.poll();
                if(saveNode.left != null) queue.add(saveNode.left);
                if(saveNode.right != null) queue.add(saveNode.right);
                if(level%2==0) {
                    currList.add(saveNode.val);
                } else {
                    stack.push(saveNode.val);
                }
            } 
            while(!stack.isEmpty()) {
                currList.add(stack.pop());
            }  
            list.add(currList);
            level++;
        }
        return list;
    }
}