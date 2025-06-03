class Solution {
    public static void swap(int[] nums,int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void moveZeroes(int[] nums) {
        int start=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                swap(nums,start,i);
                start++;
            } 
        }
        while(start != nums.length) {
            nums[start++] = 0;
        }
    }
}