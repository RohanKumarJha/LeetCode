class Solution {
    class CheckTree {
        private TreeNode node;
        private boolean flag;

        public CheckTree(TreeNode node, boolean flag) {
            this.node = node;
            this.flag = flag;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<CheckTree> st = new Stack<>();
        st.push(new CheckTree(root,false));

        while(!st.isEmpty()) {
            CheckTree nodeTree = st.pop();
            TreeNode node = nodeTree.node;
            boolean flag = nodeTree.flag;
            if (flag) {
                list.add(node.val);
            } else {
                if (node.right != null) {
                    st.push(new CheckTree(node.right, false));
                }
                st.push(new CheckTree(node, true));
                if (node.left != null) {
                    st.push(new CheckTree(node.left, false));
                }
            }
        }
        return list;
    }
}