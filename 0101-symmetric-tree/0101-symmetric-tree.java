class Solution {
    public boolean mirror(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        queue1.add(root1);
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue2.add(root2);
        while(!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode temp1 = queue1.poll();
            TreeNode temp2 = queue2.poll();
            if(temp1.val != temp2.val) return false;
            if(temp1.left != null) queue1.add(temp1.left);
            if(temp1.right != null) queue1.add(temp1.right);
            if(temp2.right != null) queue2.add(temp2.right);
            if(temp2.left != null) queue2.add(temp2.left);
            if((temp1.left!=null && temp2.right==null) || (temp1.left==null && temp2.right!=null)) return false;
            if((temp1.right!=null && temp2.left==null) || (temp1.right==null && temp2.left!=null)) return false;
        } return true;
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left==null && root.right==null) return true;
        if((root.left==null && root.right!=null) || (root.left!=null && root.right==null)) return false;
        return mirror(root.left, root.right);
    }
}