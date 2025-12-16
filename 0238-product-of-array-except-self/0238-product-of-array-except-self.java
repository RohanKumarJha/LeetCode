class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] arr = new int[n];

        int ans = 1;
        arr[0] = 1;

        // Find prefix
        for(int i=1; i<n; i++) {
            arr[i] = ans * nums[i-1];
            ans *= nums[i-1];
        }

        ans = 1;
        for(int i=n-1; i>=0; i--) {
            arr[i] = arr[i] * ans;
            ans *= nums[i];
        }

        return arr;
    }
}