class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int total = 0;
        for(int i=0; i<n; i++) {
            int sum=0;
            for(int j=i; j>=0; j--) {
                sum += nums[j];
                if(sum == k) {
                    total += 1;
                }
            }
        } return total;
    }
}