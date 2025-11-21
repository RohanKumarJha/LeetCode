class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;

        TreeNode curr = root;
        while(curr != null) {
            if(curr.left == null) {
                list.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode agla = curr.left;
                TreeNode temp = agla;
                while(temp.right != null) {
                    temp = temp.right;
                } temp.right = curr;
                curr.left = null;
                curr = agla;
            }
        } return list;
    }
}