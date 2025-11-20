class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()) {
            TreeNode elm = st.pop();
            if(elm.left!=null) st.push(elm.left);
            if(elm.right!=null) st.push(elm.right);
            list.add(0,elm.val);
        }
        return list;
    }
}