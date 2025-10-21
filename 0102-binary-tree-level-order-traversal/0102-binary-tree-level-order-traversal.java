class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return result;
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode elm = queue.poll();
                if(elm.left != null) queue.add(elm.left);
                if(elm.right != null) queue.add(elm.right);
                list.add(elm.val);
            } result.add(list);
        } return result;
    }
}