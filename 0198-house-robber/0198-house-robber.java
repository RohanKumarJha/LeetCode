class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int result = 0;
        int agla = 0;
        if(n > 1) {
            agla=Math.max(nums[0],nums[1]);
        } else return prev;
        for(int i=2; i<n; i++) {
            int include = nums[i] + prev;
            int skip = agla;
            result = Math.max(include,skip);
            prev = agla;
            agla = result;
        }
        return agla;
    }
}