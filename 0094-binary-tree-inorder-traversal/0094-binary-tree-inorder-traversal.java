class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> st1 = new Stack<>();
        st1.push(root);
        Stack<Integer> st2 = new Stack<>();
        st2.push(0);
        while(!st1.isEmpty()) {
            TreeNode temp = st1.pop();
            int value = st2.pop();
            if(value == 0) {
                if(temp.right != null) {
                    st1.push(temp.right);
                    st2.push(0);
                } st1.push(temp);
                st2.push(1);
                if(temp.left != null) {
                    st1.push(temp.left);
                    st2.push(0);
                }
            } else {
                result.add(temp.val);
            }
        } return result;
    }
}