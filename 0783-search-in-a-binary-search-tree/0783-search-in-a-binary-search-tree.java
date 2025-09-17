class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;
        while(temp!=null && temp.val != val) {
            if(val < temp.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        } return temp;
    }
}