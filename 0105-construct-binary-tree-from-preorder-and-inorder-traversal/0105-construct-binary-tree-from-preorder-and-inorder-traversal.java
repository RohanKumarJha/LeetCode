class Solution {
    private int index = 0;

    private TreeNode build(int[] preorder, int[] inorder,int start,int end) {
        if(start > end) return null;

        int rootVal = preorder[index++];
        TreeNode root = new TreeNode(rootVal);

        int mid=0;
        while(inorder[mid] != root.val) {
            mid++;
        }

        root.left = build(preorder,inorder,start,mid-1);
        root.right = build(preorder,inorder,mid+1,end);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int start=0, end=inorder.length-1;
        return build(preorder,inorder,start,end);
    }
}