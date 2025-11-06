class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return result;
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