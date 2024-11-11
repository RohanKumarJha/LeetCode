class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        k = k%n;
        for(int i=0; i<n; i++) {
            if(n-k+i < n) arr[i] = nums[n-k+i];
            else arr[i] = nums[n-k+i-n];
        }
        for(int i=0; i<n; i++) {
            nums[i] = arr[i];
        }
    }
}