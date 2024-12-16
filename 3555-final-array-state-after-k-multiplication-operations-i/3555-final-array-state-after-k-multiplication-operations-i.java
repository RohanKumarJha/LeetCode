class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        while(k > 0) {
            int min = 0;
            for(int i=0; i<n; i++) {
                if(nums[min]>nums[i]) min=i;
            }
            nums[min] *= multiplier;
            k -= 1;
        } return nums;
    }
}