class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        TreeNode start = root;
        while(start != null) {
            TreeNode agla = start.left;
            if(agla == null) {
                result.add(start.val);
                start = start.right;
            } else {
                TreeNode curr = agla;
                while(curr.right != null) {
                    curr = curr.right;
                } curr.right = start;
                start.left = null;
                start = agla;
            }
        } return result;
    }
}