/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    private Node flat(Node curr) {
        if (curr.next == null && curr.child == null) {
            return curr;
        }

        if (curr.child != null) {
            Node rightMost = flat(curr.child);

            if (curr.next != null) {
                Node hold = curr.next;
                rightMost.next = hold;
                hold.prev = rightMost;
                curr.next = curr.child;
                curr.next.prev = curr;
                curr.child = null;
                return flat(hold);
            } else {
                curr.next = curr.child;
                curr.next.prev = curr;
                curr.child = null;
                return rightMost;
            }
        } else {
            return flat(curr.next);
        }
    }

    public Node flatten(Node head) {
        if (head == null) return head;
        flat(head);
        return head;
    }
}