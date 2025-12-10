class Solution {
    public int removeDuplicates(int[] nums) {
        int start=1, end=1;
        int count = 1;
        while(end < nums.length) {
            if(nums[end] == nums[end-1]) {
                if(count != 2) {
                    nums[start++] = nums[end];
                    count++;
                }
            } else {
                nums[start++] = nums[end];
                count = 1;
            } end++;
        } return start;
    }
}