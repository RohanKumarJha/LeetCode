class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode node = st.pop();
            if(node.left != null) st.push(node.left);
            if(node.right != null) st.push(node.right);
            result.add(node.val);
        }
        Collections.reverse(result);
        return result;
    }
}