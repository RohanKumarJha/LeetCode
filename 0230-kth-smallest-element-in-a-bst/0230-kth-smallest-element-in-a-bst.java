class Solution {
    private List<Integer> result = new ArrayList<>();

    private void kth(TreeNode node) {
        if(node == null) return ;
        kth(node.left);
        result.add(node.val);
        kth(node.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        kth(root);
        for(int i=0; i<result.size(); i++) {
            if(i+1 == k) return result.get(i);
        }
        return -1;
    }
}