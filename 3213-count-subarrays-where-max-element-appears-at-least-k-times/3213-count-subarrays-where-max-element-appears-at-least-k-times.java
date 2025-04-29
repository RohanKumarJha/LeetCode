class Solution {
    public long countSubarrays(int[] nums, int k) {
        int len = nums.length;

        // Find the maximum element
        int maxElm = Integer.MIN_VALUE;
        for (int num : nums) {
            maxElm = Math.max(maxElm, num);
        }

        // Sliding window approach
        int start = 0, count = 0;
        long result = 0;

        for (int end = 0; end < len; end++) {
            if (nums[end] == maxElm) count++;

            while (count >= k) {
                result += len - end; // Subarrays starting at 'start'
                if (nums[start] == maxElm) count--;
                start++;
            }
        }

        return result;
    }
}
