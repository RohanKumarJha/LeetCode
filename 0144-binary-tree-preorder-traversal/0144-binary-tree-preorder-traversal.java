class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                list.add(curr.val);  // Visit node
                curr = curr.right;
            } else {
                // Find inorder predecessor
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    list.add(curr.val); // Visit before going left (preorder)
                    prev.right = curr;  // Temporary link
                    curr = curr.left;
                } else {
                    prev.right = null;  // Remove link
                    curr = curr.right;
                }
            }
        }

        return list;
    }
}
