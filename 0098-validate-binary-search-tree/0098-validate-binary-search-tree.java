class Solution {
    private List<Integer> list = new ArrayList<>();

    private void inorder(TreeNode node) {
        if(node == null) return ;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for(int i=1; i<list.size(); i++) {
            if(list.get(i) <= list.get(i-1)) return false;
        }
        return true;
    }
}