class Solution {
    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            int minElm = i;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j]<nums[minElm]) {
                    minElm = j;
                }
            } swap(nums,i,minElm);
        }
    }
}