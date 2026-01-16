class Solution {
    private List<Integer> result = new ArrayList<>();

    public void preorder(TreeNode node) {
        Stack<TreeNode> st = new Stack<>();
        st.add(node);
        while(!st.isEmpty()) {
            TreeNode treeNode = st.pop();
            result.add(treeNode.val);
            if(treeNode.right != null) st.push(treeNode.right);
            if(treeNode.left != null) st.push(treeNode.left);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null) preorder(root);
        return result;
    }
}