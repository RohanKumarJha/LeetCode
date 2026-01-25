class Solution {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode node = st.pop();
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);
            list.add(node.val);
        }

        return list;
    }
}