class Solution {
    private int idx = 0;
    private Map<Integer,Integer> map = new HashMap<>();

    private TreeNode build(int[] preorder, int[] inorder,int start,int end) {
        if (start > end) return null;
        TreeNode node = new TreeNode(preorder[idx++]);
        int mid = map.get(node.val);
        node.left = build(preorder,inorder,start,mid-1);
        node.right = build(preorder,inorder,mid+1,end);
        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return build(preorder,inorder,0,preorder.length-1);
    }
}