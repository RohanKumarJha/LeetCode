class Solution {
    private TreeNode convertToBST(int[] nums,int start,int end) {
        if(start > end) return null;
        int mid = start + (end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        TreeNode left = convertToBST(nums,start,mid-1);
        TreeNode right = convertToBST(nums,mid+1,end);
        node.left = left;
        node.right = right;
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int start=0, end=nums.length-1;
        return convertToBST(nums,start,end);
    }
}