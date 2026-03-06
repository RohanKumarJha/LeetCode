class Solution {
    private void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 1;
        while(end < nums.length) {
            if(nums[end] != nums[start]) {
                start++;
                swap(nums,start,end);
            } end++;
        }
        return start+1;
    }
}