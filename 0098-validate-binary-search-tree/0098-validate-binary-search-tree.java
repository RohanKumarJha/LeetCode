class Solution {
    public List<Integer> inOrder(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
        return list;
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = inOrder(root, list);
        for(int i=1; i<result.size(); i++) {
            if(list.get(i-1) >= list.get(i)) return false;
        } return true;
    }
}