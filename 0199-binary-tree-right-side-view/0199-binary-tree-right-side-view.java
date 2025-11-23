class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return result;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                TreeNode elm = q.remove();
                if(i == size-1) result.add(elm.val);
                if(elm.left != null) q.add(elm.left);
                if(elm.right != null) q.add(elm.right);
            }
        } return result;
    }
}