class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int redCount=0, whiteCount=0, blueCount=0;
        for(int i=0; i<n; i++) {
            if(nums[i] == 0) redCount++;
            else if(nums[i] == 1) whiteCount++;
            else blueCount++;
        }
        for(int i=0; i<redCount; i++) {
            nums[i] = 0;
        }
        for(int i=0; i<whiteCount; i++) {
            nums[redCount+i] = 1;
        }
        for(int i=0; i<blueCount; i++) {
            nums[(redCount+whiteCount)+i] = 2;
        }
    }
}