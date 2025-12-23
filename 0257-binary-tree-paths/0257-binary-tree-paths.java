class Solution {
    private List<String> result = new ArrayList<>();

    private void binaryTree(TreeNode node,StringBuilder sb) {
        if(node == null) return ;
        int len = sb.length();
        sb.append(node.val);
        if(node.left==null && node.right==null) {
            result.add(sb.toString());
        }
        sb.append("->");
        binaryTree(node.left,sb);
        binaryTree(node.right,sb);
        sb.setLength(len);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        binaryTree(root, sb);
        return result;
    }
}