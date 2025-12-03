class Solution {
    private int result = 0;

    private void path(TreeNode node,long sum,int targetSum,Map<Long,Integer> map) {

        if(node == null) return ;

        sum += node.val;
        result += map.getOrDefault(sum - targetSum, 0);

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        path(node.left,sum,targetSum,map);
        path(node.right,sum,targetSum,map);

        map.put(sum,map.get(sum)-1);
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        Map<Long,Integer> map = new HashMap<>();
        map.put(0l,1);
        path(root,0,targetSum,map);
        return result;
    }
}