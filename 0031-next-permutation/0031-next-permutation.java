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

    public int iterate(int[] nums,int start,int end) {
        int box2 = end;
        for(int i=start+1; i<=end; i++) {
            if(nums[i] <= nums[start]) {
                return box2;
            } box2 = i;
        } return box2;
    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        boolean flag = true;
        int box = -1;
        for(int i=len-1; i>0; i--) {
            if(nums[i] > nums[i-1]) {
                box = i-1;
                int newBox = iterate(nums,i-1,len-1);
                swap(nums,box,newBox);
                reverse(nums,i,len-1);
                flag = false;
                break;
            }
        }
        if(flag) {
            reverse(nums,0,len-1);
        }
    }
}