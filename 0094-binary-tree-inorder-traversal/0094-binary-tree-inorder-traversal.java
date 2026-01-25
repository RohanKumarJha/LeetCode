class Solution {
    class Pair {
        TreeNode node;
        boolean flag;
        Pair(TreeNode node,boolean flag) {
            this.node = node;
            this.flag = flag;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,false));
        while(!st.isEmpty()) {
            Pair p = st.pop();
            if(p.flag == true) {
                result.add(p.node.val);
            } else {
                if(p.node.right != null) st.push(new Pair(p.node.right,false));
                st.push(new Pair(p.node,true));
                if(p.node.left != null) st.push(new Pair(p.node.left,false));
            }
        }
        return result;
    }
}