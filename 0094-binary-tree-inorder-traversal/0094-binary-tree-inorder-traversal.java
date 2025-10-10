class Solution {

    public class Pair {
        TreeNode node;
        int count;
        Pair(TreeNode node,int count) {
            this.node = node;
            this.count = count;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,0));

        while(!st.isEmpty()) {
            Pair temp = st.pop();
            TreeNode node = temp.node;
            int count = temp.count;
            if(count == 1) {
                result.add(node.val);
            } else {
                if(node.right != null) st.push(new Pair(node.right,0));
                st.push(new Pair(node,1));
                if(node.left != null) st.push(new Pair(node.left,0));
            }
        } return result;
    }
}