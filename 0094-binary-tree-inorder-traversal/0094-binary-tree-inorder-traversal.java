class Solution {

    private List<Integer> list = new ArrayList<>();

    class Pair {
        TreeNode node;
        boolean flag;
        Pair(TreeNode node,boolean flag) {
            this.node = node;
            this.flag = flag;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return list;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,false));
        while(!st.isEmpty()) {
            Pair pair = st.pop();
            if(pair.flag == false) {
                if(pair.node.right != null) st.push(new Pair(pair.node.right, false));
                st.push(new Pair(pair.node, true));
                if(pair.node.left != null) st.push(new Pair(pair.node.left, false));
            } else {
                list.add(pair.node.val);
            }
        }
        return list;
    }
}