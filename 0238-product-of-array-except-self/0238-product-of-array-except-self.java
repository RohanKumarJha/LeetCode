class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        Arrays.fill(leftArray, 1);
        Arrays.fill(rightArray, 1);
        for(int i=1; i<nums.length; i++) {
            leftArray[i] = leftArray[i-1]*nums[i-1];
        }
        for(int i=nums.length-2; i>=0; i--) {
            rightArray[i] = rightArray[i+1]*nums[i+1];
        } 
        for(int i=0; i<nums.length; i++) {
            nums[i] = leftArray[i]*rightArray[i];
        } return nums;
    }
}