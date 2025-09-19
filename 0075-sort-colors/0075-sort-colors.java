class Solution {
    public void swap(int[] nums, int START, int END) {
        int TEMP = nums[START];
        nums[START] = nums[END];
        nums[END] = TEMP;
    }

    public void sortColors(int[] nums) {
        int START=0, MID=0, END=nums.length-1;
        while(MID <= END) {
            if(nums[MID] == 0) {
                swap(nums, START, MID);
                START++; MID++;
            } else if(nums[MID] == 1) {
                MID++;
            } else {
                swap(nums, MID, END);
                END--;
            }
        }
    }
}