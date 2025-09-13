class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(root); st2.push(0);
        while(!st1.isEmpty()){
            TreeNode temp1 = st1.pop();
            int temp2 = st2.pop();
            if(temp2 == 1) {
                result.add(temp1.val);
            } else {
                if(temp1.right != null) {
                    st1.push(temp1.right);
                    st2.push(0);
                } st1.push(temp1);
                st2.push(1);
                if(temp1.left != null) {
                    st1.push(temp1.left);
                    st2.push(0);
                }
            }
        } return result;        
    }
}