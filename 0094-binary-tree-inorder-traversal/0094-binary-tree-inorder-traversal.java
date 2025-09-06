class Solution {
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack1 = new Stack<>();  Stack<Integer> stack2 = new Stack<>();
        stack1.push(root); stack2.push(0);
        while(!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();  
            int tempVal = stack2.pop();
            if(tempVal == 1) {
                list.add(temp.val);
            } else {
                if(temp.right != null) stack1.push(temp.right); 
                if(temp.right != null) stack2.push(0);
                stack1.push(temp); stack2.push(1);
                if(temp.left != null) stack1.push(temp.left); 
                if(temp.left != null) stack2.push(0);
            }
        } return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        return inOrder(root);
    }
}