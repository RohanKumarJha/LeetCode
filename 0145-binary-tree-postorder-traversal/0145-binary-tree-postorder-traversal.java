class Solution {
    public static List<Integer> postOrderUsingIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if(temp.left != null) stack.push(temp.left);
            if(temp.right != null) stack.push(temp.right);
        } return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrderList = postOrderUsingIterative(root);
        Collections.reverse(postOrderList);
        return postOrderList;
    }
}