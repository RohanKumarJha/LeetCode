class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            maxVal = Math.max(maxVal, nums[i]);
            minVal = Math.min(minVal, nums[i]);
        }
        for(int i=minVal; i>1; i--) {
            if((maxVal%i==0) && (minVal%i==0)){
                return i;
            }
        } return 1;
    }
}