class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            int min = i;
            for(int j=i; j<n; j++) {
                if(nums[min]>nums[j]) min=j;
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
}