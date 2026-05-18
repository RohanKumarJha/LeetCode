class Solution {

    class Node {
        TreeNode node;
        boolean flag;

        Node(TreeNode node, boolean flag) {
            this.node = node;
            this.flag = flag;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) return list;

        Stack<Node> st = new Stack<>();
        st.push(new Node(root, false));

        while (!st.isEmpty()) {

            Node curr = st.pop();

            if (curr.flag) {
                list.add(curr.node.val);
            } else {

                // Right
                if (curr.node.right != null) {
                    st.push(new Node(curr.node.right, false));
                }

                // Root
                st.push(new Node(curr.node, true));

                // Left
                if (curr.node.left != null) {
                    st.push(new Node(curr.node.left, false));
                }
            }
        }

        return list;
    }
}