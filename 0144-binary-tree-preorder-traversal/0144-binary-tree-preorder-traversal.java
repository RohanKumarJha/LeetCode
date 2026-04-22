class Solution {
    private List<Integer> preorder(TreeNode node, List<Integer> result) {
        Stack<TreeNode> st = new Stack<>();
        st.push(node);
        
        while(!st.isEmpty()) {
            TreeNode top = st.pop();
            if(top.right != null) {
                st.push(top.right);
            }
            if(top.left != null) {
                st.push(top.left);
            }
            result.add(top.val);
        }
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        return preorder(root, result);
    }
}