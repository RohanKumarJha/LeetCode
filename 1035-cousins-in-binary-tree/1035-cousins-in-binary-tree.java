class Solution {
    public boolean isDifferentParents(TreeNode root, int x, int y) {
        if (root == null) return true;

        if (root.left != null && root.right != null) {
            if ((root.left.val == x && root.right.val == y) || 
                (root.left.val == y && root.right.val == x)) {
                return false; // same parent
            }
        }

        // Recurse on both sides, return true if they don't share same parent anywhere
        return isDifferentParents(root.left, x, y) && isDifferentParents(root.right, x, y);
    }

    public int level(TreeNode root, int x, int level) {
        if (root == null) return -1;
        if (root.val == x) return level;

        int left = level(root.left, x, level + 1);
        if (left != -1) return left;

        return level(root.right, x, level + 1);
    }

    public boolean isSameLevel(TreeNode root, int x, int y) {
        int levelOfX = level(root, x, 0);
        int levelOfY = level(root, y, 0);
        return levelOfX == levelOfY;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        return isSameLevel(root, x, y) && isDifferentParents(root, x, y);
    }
}
