class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack1 = new Stack<>();
        stack1.push(root);
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(0);
        while(!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();
            int value = stack2.pop();
            if(value == 0) {
                if(temp.right != null) {
                    stack1.push(temp.right);
                    stack2.push(0);
                } stack1.push(temp); stack2.push(1);
                if(temp.left != null) {
                    stack1.push(temp.left);
                    stack2.push(0);
                }
            } else {
                list.add(temp.val);
            }
        } return list;
    }
}