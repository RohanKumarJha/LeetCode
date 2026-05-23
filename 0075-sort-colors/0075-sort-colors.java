class Solution {
    private void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void sortColors(int[] nums) {
        int size = nums.length;
        for(int i=0; i<size; i++) {
            int index = i;
            for(int j=i; j<size; j++) {
                if(nums[j] < nums[index]) {
                    index = j;
                }
            }
            swap(nums,index,i);
        }
    }
}