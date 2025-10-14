class Solution {

    public void reverse(int[] nums,int start,int end) {
        while(start < end) {
            swap(nums,start,end);
            start++; end--;
        }
    }

    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void nextPermutation(int[] nums) {
        int size = nums.length;
        int index = -1;
        for(int i=size-1; i>0; i--) {
            if(nums[i] > nums[i-1]) {
                index = i-1;
                break;
            }
        }

        if(index == -1) {
            reverse(nums,0,size-1);
        } else {
            int pos = size-1;
            while(nums[pos] <= nums[index]) {
                pos--;
            }
            swap(nums,index,pos);
            reverse(nums,index+1,size-1);
        }
    }
}