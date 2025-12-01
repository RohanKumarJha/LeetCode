class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;
        while(temp != null) {
            if(temp.val < val) {
                temp = temp.right;
            } else if(temp.val > val) {
                temp = temp.left;
            } else {
                return temp;
            }
        }
        return temp;
    }
}