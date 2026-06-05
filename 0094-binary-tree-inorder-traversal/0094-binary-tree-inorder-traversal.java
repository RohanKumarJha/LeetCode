class Solution {

    class CheckTreeNode {
        private TreeNode node;
        private boolean flag;

        public CheckTreeNode(TreeNode node,boolean flag) {
            this.node = node;
            this.flag = flag;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<CheckTreeNode> st = new Stack<>();
        st.push(new CheckTreeNode(root,false));

        while(!st.isEmpty()) {
            CheckTreeNode removeElm = st.pop();
            if(removeElm.flag == true) {
                result.add(removeElm.node.val);
            } else {
                if(removeElm.node.right != null) st.push(new CheckTreeNode(removeElm.node.right,false));
                st.push(new CheckTreeNode(removeElm.node,true));
                if(removeElm.node.left != null) st.push(new CheckTreeNode(removeElm.node.left,false));
            }
        }

        return result;
    }
}