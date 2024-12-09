class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int s=0, e=n-1;
        int mid=n/2;
        if(n%2==0) {
            mid=n/2-1;
        }
        while(mid <= e) {
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[s];
                nums[s] = temp;
                s += 1;
            } else if(nums[mid] == 1) {
                mid += 1;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[e];
                nums[e] = temp;
                e -= 1;
            }
        }
    }
}