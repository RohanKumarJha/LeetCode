class Solution {
    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public int removeElement(int[] nums, int val) {
        int pos=0, idx=0;
        while(idx < nums.length) {
            if(nums[idx] != val)  {
                swap(nums,idx,pos);
                pos++;
            } idx++;
        } return pos;
    }
}