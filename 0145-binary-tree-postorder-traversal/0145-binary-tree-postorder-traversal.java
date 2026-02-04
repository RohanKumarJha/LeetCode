class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode node = st.pop();
            if(node.left != null) st.push(node.left);
            if(node.right != null) st.push(node.right);
            list.add(0,node.val);
        }
        return list;
    }
}