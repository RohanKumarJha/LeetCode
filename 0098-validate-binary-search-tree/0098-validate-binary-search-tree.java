class Solution {
    private void isValid(TreeNode node,ArrayList<Integer> arr) {
        if(node == null) return ;
        isValid(node.left,arr);
        arr.add(node.val);
        isValid(node.right,arr);
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) return false;
        ArrayList<Integer> arr = new ArrayList<>();
        isValid(root,arr);
        for(int i=1; i<arr.size(); i++) {
            if(arr.get(i) <= arr.get(i-1)) return false;
        } 
        return true;
    }
}