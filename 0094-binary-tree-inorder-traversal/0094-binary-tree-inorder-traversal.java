class Solution {
    
    public List<Integer> inOrder(TreeNode root,List<Integer> list) {
        if(root == null) return list;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = inOrder(root, list);
        return result;
    }
}