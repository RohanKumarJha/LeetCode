class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int count = 1;
        int start=0, end=1;
        while(end != nums.length) {
            if(nums[start] == nums[end]) {
                end++;
            } else {
                nums[start+1] = nums[end++];
                start++;
                count++;
            }
        } return count;
    }
}