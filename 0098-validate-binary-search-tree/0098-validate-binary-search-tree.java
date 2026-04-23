class Solution {
    private void inorder(TreeNode node,List<Integer> list) {
        if(node == null) return ;
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        for(int i=1; i<list.size(); i++) {
            if(list.get(i) <= list.get(i-1)) return false;
        }
        return true;
    }
}