class Solution {
    private void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    private void reverse(int[] nums,int start,int end) {
        while(start < end) {
            swap(nums,start,end);
            start++; end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int pos = -1;
        for(int i=nums.length-1; i>0; i--) {
            if(nums[i-1] < nums[i]) {
                pos = i-1;
                break;
            }
        }
        if(pos == -1) {
            reverse(nums,0,nums.length-1);
        } 
        else {
            int pos2 = -1;
            for(int i=pos+1; i<nums.length; i++) {
                if(nums[i] <= nums[pos]) {
                    pos2 = i-1;
                    break;
                }
            }

            if(pos2 == -1) {
                swap(nums,pos,nums.length-1);
                reverse(nums,pos+1,nums.length-1);
            } else {
                swap(nums,pos,pos2);
                reverse(nums,pos+1,nums.length-1);
            }
        }

    }
}