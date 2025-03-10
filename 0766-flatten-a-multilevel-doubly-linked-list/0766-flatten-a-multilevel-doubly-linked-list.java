class Solution {
    private Node flat(Node curr) {
        if (curr == null) return null;

        if (curr.child != null) {
            Node rightMost = flat(curr.child);

            if (curr.next != null) {
                rightMost.next = curr.next;
                curr.next.prev = rightMost;
            }

            curr.next = curr.child;
            curr.child.prev = curr;
            curr.child = null;
        }

        return (curr.next != null) ? flat(curr.next) : curr;
    }

    public Node flatten(Node head) {
        flat(head);
        return head;
    }
}
