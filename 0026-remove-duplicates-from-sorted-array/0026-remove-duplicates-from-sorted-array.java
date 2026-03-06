class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 1;
        while(end < nums.length) {
            if(nums[end] != nums[start]) {
                start++;
                nums[start] = nums[end];
            } end++;
        }
        return start+1;
    }
}