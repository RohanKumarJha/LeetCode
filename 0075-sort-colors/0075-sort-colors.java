class Solution {
    public void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++) {
            for(int j=i; j<len; j++) {
                if(nums[j] == 0) {
                    swap(nums,i,j);
                    i++;
                }
            }
            for(int j=i; j<len; j++) {
                if(nums[j] == 1) {
                    swap(nums,i,j);
                    i++;
                }
            }
        }
    }
}