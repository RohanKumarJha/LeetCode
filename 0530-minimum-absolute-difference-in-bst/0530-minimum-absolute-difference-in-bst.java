class Solution {
    public List<Integer> minDiff(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        minDiff(root.left, list);
        list.add(root.val);
        minDiff(root.right, list);
        return list;
    }
    
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = minDiff(root,new ArrayList<>());
        int result = Integer.MAX_VALUE;
        for(int i=1; i<list.size(); i++) {
            result = Math.min(result,Math.abs(list.get(i)-list.get(i-1)));
        } return result;
    }
}