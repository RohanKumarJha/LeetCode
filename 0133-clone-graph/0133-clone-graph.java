class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // We assume max node value ≤ 100 (can adjust as needed)
        Node[] clones = new Node[101];
        boolean[] visited = new boolean[101];

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        // Create clone for starting node
        clones[node.val] = new Node(node.val, new ArrayList<>());

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (visited[curr.val]) continue;  // already processed
            visited[curr.val] = true;

            for (Node neighbor : curr.neighbors) {
                // Create clone for neighbor if not already made
                if (clones[neighbor.val] == null) {
                    clones[neighbor.val] = new Node(neighbor.val, new ArrayList<>());
                }

                // Add edge in cloned graph
                clones[curr.val].neighbors.add(clones[neighbor.val]);

                // Enqueue neighbor for BFS
                if (!visited[neighbor.val]) {
                    queue.add(neighbor);
                }
            }
        }

        return clones[node.val];
    }
}
