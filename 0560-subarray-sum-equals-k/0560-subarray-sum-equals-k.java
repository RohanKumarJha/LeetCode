class Solution {
    private int subarray(int[] nums, int k, int len, int result) {
        for(int i=0; i<len; i++) {
            int sum = 0;
            for(int j=i; j<len; j++) {
                sum += nums[j];
                if(sum == k) result++;
            }
        }
        return result;
    }

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        return subarray(nums, k, n, 0);
    }
}