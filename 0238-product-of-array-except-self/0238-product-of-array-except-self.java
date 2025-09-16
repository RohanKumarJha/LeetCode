class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(i==0) left[i]=1;
            else left[i]=left[i-1]*nums[i-1];
        }
        int lastIndex = 1;
        for(int i=nums.length-1; i>=0; i--) {
            int carry = nums[i];
            nums[i] = lastIndex*left[i];
            lastIndex *= carry;
        } return nums;
    }
}