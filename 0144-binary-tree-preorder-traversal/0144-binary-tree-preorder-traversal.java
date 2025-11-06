class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return result;
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode node = st.pop();
            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);
            result.add(node.val);
        } return result;
    }
}