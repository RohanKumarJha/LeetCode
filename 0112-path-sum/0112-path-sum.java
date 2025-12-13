class Solution {
    private boolean pathSum(TreeNode node,int sum,int ts) {

        if(node == null) return false;

        sum += node.val;

        if(node.left==null && node.right==null) {
            if(sum == ts) return true;
        }

        return pathSum(node.left,sum,ts) || pathSum(node.right,sum,ts);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return pathSum(root,0,targetSum);
    }
}