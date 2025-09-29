class Solution {

    public class Pair {
        private TreeNode node;
        private Integer value;

        Pair(TreeNode node,Integer value) {
            this.node = node;
            this.value = value;
        }
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,0));
        while(!st.isEmpty()) {
            Pair curr = st.pop();
            if(curr.value == 1) {
                list.add(curr.node.val);
            } else {
                if(curr.node.right != null) {
                    st.push(new Pair(curr.node.right,0));
                } st.push(new Pair(curr.node,1));
                if(curr.node.left != null) {
                    st.push(new Pair(curr.node.left,0));
                }
            }
        } return list;
    }
}