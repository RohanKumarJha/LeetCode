class Solution {
    public int findPeakElement(int[] nums) {
        int SIZE=nums.length;
        if(SIZE == 1) return 0;
        if(SIZE == 2) {
            return (nums[0]>nums[1])?0:1;
        }
        int START=0, END=SIZE-1;
        while(START <= END) {
            int MID = START+(END-START)/2;
            if(START==MID & START==END) return START;
            if(MID == 0) {
                return (nums[0]>nums[1])?0:1;
            }
            if(nums[MID-1] < nums[MID] && nums[MID] > nums[MID+1]) {
                return MID;
            } else if(nums[MID-1] > nums[MID]) {
                END = MID-1;
            } else {
                START = MID+1;
            }
        } return 0;
    }
}