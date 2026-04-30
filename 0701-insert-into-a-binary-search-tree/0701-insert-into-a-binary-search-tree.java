class Solution {
    private void insertIntoBst(TreeNode curr, TreeNode prev, int val) {
        while(curr != null) {
            if(curr != null) prev=curr;
            if(curr.val < val) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        } 
        TreeNode node = new TreeNode(val);
        if(prev.val < val) {
            prev.right = node;
        } else {
            prev.left = node;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        insertIntoBst(root, root, val);
        return root;
    }
}