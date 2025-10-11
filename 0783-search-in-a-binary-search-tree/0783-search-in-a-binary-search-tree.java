class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;
        while(temp != null) {
            if(temp.val == val) return temp;
            if(temp.val < val) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return temp;
    }
}