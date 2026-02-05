class Solution {
    
    private List<Integer> list = new ArrayList<>();

    private void isValid(TreeNode node) {
        if(node == null) return ;
        isValid(node.left);
        list.add(node.val);
        isValid(node.right);
    }

    public boolean isValidBST(TreeNode root) {
        isValid(root);
        for(int i=1; i<list.size(); i++) {
            if(list.get(i) <= list.get(i-1)) return false;
        }
        return true;
    }
}