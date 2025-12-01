/*
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                Node temp = q.remove();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                if(size == 1) {
                    temp.next = null;
                } else {
                    if(i != size-1) {
                        temp.next = q.peek();
                    } else {
                        temp.next = null;
                    }
                }
            }
        }
        return root;
    }
}