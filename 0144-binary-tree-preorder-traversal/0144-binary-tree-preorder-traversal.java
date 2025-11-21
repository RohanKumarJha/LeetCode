class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        TreeNode curr = root;

        while (curr != null) {

            if (curr.left == null) {
                list.add(curr.val);
                curr = curr.right;

            } else {
                TreeNode agla = curr.left;
                TreeNode temp = agla;

                // find rightmost node
                while (temp.right != null && temp.right != curr) {
                    temp = temp.right;
                }

                if (temp.right == null) {
                    // create thread (first time)
                    list.add(curr.val);   // preorder visit
                    temp.right = curr;
                    curr = curr.left;
                } else {
                    // thread exists → remove it
                    temp.right = null;
                    curr = curr.right;
                }
            }
        }

        return list;
    }
}
