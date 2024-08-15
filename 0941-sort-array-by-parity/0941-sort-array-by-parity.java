class Solution {
    public static void swap(int num1,int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int val = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2==0) {
                int temp = nums[i];
                nums[i] = nums[val];
                nums[val] = temp;
                val++;
            }
        } return nums;
    }
}