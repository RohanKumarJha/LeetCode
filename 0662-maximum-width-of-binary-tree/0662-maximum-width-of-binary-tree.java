class Solution {
    static class Pair {
        int index;
        TreeNode node;
        Pair(int index, TreeNode node) {
            this.index = index;
            this.node = node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int answer = 0;
        if(root == null) return answer;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,root));

        while(!q.isEmpty()) {
            int size = q.size();
            int start = 0;
            int end = 0;
            for(int i=0; i<size; i++) {
                Pair temp = q.remove();
                int index = temp.index;
                TreeNode node = temp.node;
                if(i==0) start=index;
                if(i==size-1) end=index;
                if(node.left != null) q.add(new Pair(index * 2, node.left));
                if(node.right != null) q.add(new Pair(index * 2 + 1, node.right));
            }
            answer = Math.max(answer,end-start+1);
        } return answer;
    }
}