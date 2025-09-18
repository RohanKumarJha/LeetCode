class Solution {
    public class Pair {
        private TreeNode node;
        private int value;
        Pair(TreeNode node, int value) {
            this.node = node;
            this.value = value;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,0));
        while(!st.isEmpty()) {
            Pair pair = st.pop();
            TreeNode temp = pair.node;
            int value = pair.value;
            if(value == 1) {
                result.add(temp.val);
            } else {
                if(temp.right != null) {
                    st.push(new Pair(temp.right,0));
                } st.push(new Pair(temp,1));
                if(temp.left != null) {
                    st.push(new Pair(temp.left,0));
                }
            }
        } return result;
    }
}