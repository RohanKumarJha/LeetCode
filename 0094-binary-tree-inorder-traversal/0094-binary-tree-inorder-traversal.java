class Solution {
    private class CheckStack {
        TreeNode node;
        boolean existAgain;
        CheckStack(TreeNode node,boolean existAgain) {
            this.node = node;
            this.existAgain = existAgain;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<CheckStack> st = new Stack<>();
        st.push(new CheckStack(root,false));
        while(!st.isEmpty()) {
            CheckStack elm = st.pop();
            TreeNode temp = elm.node;
            boolean flag = elm.existAgain;
            if(flag == true) {
                result.add(temp.val);
                continue;
            }
            if(temp.right != null) st.push(new CheckStack(temp.right,false));
            st.push(new CheckStack(temp,true));
            if(temp.left != null) st.push(new CheckStack(temp.left,false));
        } return result;
    }
}