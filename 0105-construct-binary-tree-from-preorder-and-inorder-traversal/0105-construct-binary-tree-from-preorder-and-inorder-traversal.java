class Solution {
    private int idx = 0;

    private TreeNode build(int[] preorder, int[] inorder,int start,int end) {
        if (start > end) return null;
        TreeNode node = new TreeNode(preorder[idx++]);
        int index = start;
        while(node.val != inorder[index]) {
            index++;
        }
        node.left = build(preorder,inorder,start,index-1);
        node.right = build(preorder,inorder,index+1,end);

        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,preorder.length-1);
    }
}