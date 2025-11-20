class Solution {
    class Pair {
        TreeNode node;
        boolean flag;
        Pair(TreeNode node,boolean flag) {
            this.node = node;
            this.flag = flag;
        }
    }

    private void inorder(TreeNode root,List<Integer> list) {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,false));
        while(!st.isEmpty()) {
            Pair elm = st.pop();
            if(elm.flag == true) {
                list.add(elm.node.val);
            } else {
                if(elm.node.right != null) st.push(new Pair(elm.node.right,false));
                st.push(new Pair(elm.node,true));
                if(elm.node.left != null) st.push(new Pair(elm.node.left,false));
            }
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        inorder(root,list);
        return list;
    }
}