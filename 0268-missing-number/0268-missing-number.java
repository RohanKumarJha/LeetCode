class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = n*(n-1)/2;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += nums[i];
        }
        if(sum == ans) return n;
        return sum-ans+n-2;
    }
}