class Solution {

    class TreeFlag {
        private TreeNode node;
        private boolean flag;

        TreeFlag(TreeNode node, boolean flag) {
            this.node = node;
            this.flag = flag;
        }
    }

    private List<Integer> inorder(TreeNode node, List<Integer> result) {
        Stack<TreeFlag> st = new Stack<>();
        st.push(new TreeFlag(node,false));
        
        while(!st.isEmpty()) {
            TreeFlag treeFlag = st.pop();
            if(treeFlag.flag == true) {
                result.add(treeFlag.node.val);
            } else {
                if(treeFlag.node.right != null) {
                    st.push(new TreeFlag(treeFlag.node.right, false));
                }
                st.push(new TreeFlag(treeFlag.node, true));
                if(treeFlag.node.left != null) {
                    st.push(new TreeFlag(treeFlag.node.left, false));
                }
            }
        }

        return result;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        return inorder(root, result);
    }
}