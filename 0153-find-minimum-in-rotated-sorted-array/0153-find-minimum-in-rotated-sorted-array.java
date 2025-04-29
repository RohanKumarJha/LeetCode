class Solution {
    public int findMin(int[] nums) {
        int minElm = Integer.MAX_VALUE;
        for(int i : nums) {
            minElm = Math.min(i,minElm);
        } return minElm;
    }
}