class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // go left as far as possible
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // visit node
            curr = stack.pop();
            list.add(curr.val);

            // now explore right
            curr = curr.right;
        }

        return list;
    }
}
