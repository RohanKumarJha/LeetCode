class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode temp = st.pop();
            if(temp.left != null) st.push(temp.left);
            if(temp.right != null) st.push(temp.right);
            result.add(0,temp.val);
        } return result;
    }
}