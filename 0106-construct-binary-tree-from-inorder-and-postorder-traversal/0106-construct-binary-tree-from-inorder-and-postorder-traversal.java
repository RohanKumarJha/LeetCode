class Solution {
    private int index;

    private TreeNode build(int[] inorder, int[] postorder,int start,int end) {
        if(start > end) return null;

        int indexVal = postorder[index--];
        TreeNode node = new TreeNode(indexVal);

        int mid = 0;
        while(inorder[mid] != node.val) {
            mid++;
        }

        node.right = build(inorder,postorder,mid+1,end);
        node.left = build(inorder,postorder,start,mid-1);

        return node;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length-1;
        return build(inorder,postorder,0,postorder.length-1);
    }
}