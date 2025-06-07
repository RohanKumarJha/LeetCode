class Solution {
    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void moveZeroes(int[] nums) {
        int s=0, e=0; 
        while(e != nums.length) {
            if(nums[e] != 0) {
                swap(nums,s,e);
                s++;
            } e++;
        }
        while(s != nums.length) {
            nums[s] = 0;
            s++;
        }
    }
}