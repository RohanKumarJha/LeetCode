class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        TreeNode curr = root;

        while(curr != null) {
            if(curr.left == null) {
                result.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode temp = curr.left;
                while(temp.right!=null && temp.right!=curr) {
                    temp = temp.right;
                }
                if(temp.right == null) {
                    temp.right = curr;
                    curr = curr.left;
                } else {
                    temp.right = null;
                    result.add(curr.val);
                    curr = curr.right;
                }
            }
        } return result;
    }
}