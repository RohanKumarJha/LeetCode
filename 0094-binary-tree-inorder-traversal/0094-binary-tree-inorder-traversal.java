class Solution {
    private class CheckVisited {
        TreeNode val;
        boolean isVisited;
        CheckVisited(TreeNode val,boolean isVisited) {
            this.val = val;
            this.isVisited = isVisited;
        }    
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<CheckVisited> st = new Stack<>();
        if(root == null) return result;
        st.push(new CheckVisited(root,false));
        while(!st.isEmpty()) {
            CheckVisited checkVisited = st.pop();
            TreeNode node = checkVisited.val;
            boolean isVisited = checkVisited.isVisited;
            if(isVisited == true) {
                result.add(node.val);
            } else {
                if(node.right != null) st.push(new CheckVisited(node.right,false));
                st.push(new CheckVisited(node,true));
                if(node.left != null) st.push(new CheckVisited(node.left,false));
            }
        } return result;
    }
}