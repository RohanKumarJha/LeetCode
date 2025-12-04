class Solution {
    private int result = 0;

    private void sum(TreeNode node,int sum) {
        if(node == null) return;

        sum = sum*10 + node.val;

        if(node.left==null && node.right==null) {
            result += sum;
        }

        sum(node.left,sum);
        sum(node.right,sum);

        sum /= 10;
    }

    public int sumNumbers(TreeNode root) {
        if(root == null) return result;
        sum(root,0);
        return result;
    }
}