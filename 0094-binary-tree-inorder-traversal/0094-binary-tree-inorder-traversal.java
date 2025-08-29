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
                TreeNode pre = curr.left;
                while(pre.right!=null && pre.right!=curr) {
                    pre = pre.right;
                }
                if(pre.right == null) {
                    pre.right = curr;
                    curr = curr.left;
                } else {
                    pre.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
        } return list;
    }
}