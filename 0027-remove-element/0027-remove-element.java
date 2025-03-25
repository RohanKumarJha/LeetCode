class Solution {
    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int pointer=0, index=0;
        int count = 0;
        while(index != nums.length) {
            if(nums[index] == val) {
                index++;
            } else {
                swap(nums,pointer,index);
                pointer++; 
                index++;
                count += 1;
            }
        } return count;
    }
}