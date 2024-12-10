class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length; 
        int s=0, mid=0, e=n-1;
        while(mid<=e) {
            if(nums[mid]==0) {
                int temp = nums[s];
                nums[s] = nums[mid];
                nums[mid] = temp;
                s++; mid++;
            } else if(nums[mid]==1) {
                mid++;
            } else {
                int temp = nums[e];
                nums[e] = nums[mid];
                nums[mid] = temp;
                e--;
            }
        }
    }
}