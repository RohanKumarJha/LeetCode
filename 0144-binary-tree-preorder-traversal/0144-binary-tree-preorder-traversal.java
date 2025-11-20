class Solution {
    private void preorder(TreeNode root,List<Integer> list) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode elm = st.pop();
            if(elm.right != null) st.push(elm.right);
            if(elm.left != null) st.push(elm.left);
            list.add(elm.val);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        preorder(root,list);
        return list;
    }
}