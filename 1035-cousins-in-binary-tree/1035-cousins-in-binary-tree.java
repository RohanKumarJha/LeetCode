class Solution {
    public boolean checkParent(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {  
                TreeNode temp = queue.poll();
                if(temp.left != null && temp.right!= null) {
                    if((temp.left.val==x && temp.right.val==y) || ((temp.left.val==y && temp.right.val==x))) return false;
                }
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            } 
        } return true;
    }

    public int level(TreeNode root, int x) {
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {  
                TreeNode temp = queue.poll();
                if(temp.val == x) return level;
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            } level++;
        } return level;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        int levelOfX = level(root, x);
        int levelOfY = level(root, y);
        if(levelOfX != levelOfY) return false;
        return checkParent(root, x, y);
    }
}