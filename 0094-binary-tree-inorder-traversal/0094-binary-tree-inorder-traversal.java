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
            Pair temp = st.pop();
            if(temp.flag == true) {
                result.add(temp.node.val);
            } else {
                if(temp.node.right != null) st.push(new Pair(temp.node.right,false));
                st.push(new Pair(temp.node,true));
                if(temp.node.left != null) st.push(new Pair(temp.node.left,false));
            }
        } return result;
    }
}