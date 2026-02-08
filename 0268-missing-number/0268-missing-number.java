class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual_sum = (n*(n+1))/2;
        int current_sum = 0;
        for(int i : nums) {
            current_sum += i;
        }
        return actual_sum-current_sum;
    }
}