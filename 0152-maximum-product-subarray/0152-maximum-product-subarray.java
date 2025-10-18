class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax; // store previous max before updating

            // current max/min can be either:
            // 1. the current number itself
            // 2. current number * previous max
            // 3. current number * previous min (if nums[i] < 0)
            currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            currMin = Math.min(nums[i], Math.min(temp * nums[i], currMin * nums[i]));

            result = Math.max(result, currMax);
        }

        return result;
    }
}
