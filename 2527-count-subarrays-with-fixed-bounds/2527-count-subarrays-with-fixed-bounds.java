class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int minIndex = -1, maxIndex = -1, leftBound = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                leftBound = i;
            }
            if (nums[i] == minK) {
                minIndex = i;
            }
            if (nums[i] == maxK) {
                maxIndex = i;
            }
            
            if (minIndex != -1 && maxIndex != -1) {
                count += Math.max(0, Math.min(minIndex, maxIndex) - leftBound);
            }
        }
        
        return count;
    }
}
