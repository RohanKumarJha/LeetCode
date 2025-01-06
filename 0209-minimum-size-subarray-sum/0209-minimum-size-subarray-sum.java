class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int j=0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum =0;
        while(j<n){
                    sum = sum + nums[j];

         while(sum>=target){
            min = Math.min((j-i+1),min);
            sum = sum - nums[i];
             i++;

         }
        j++;
         
        }
        return min == Integer.MAX_VALUE? 0: min;
            }
}