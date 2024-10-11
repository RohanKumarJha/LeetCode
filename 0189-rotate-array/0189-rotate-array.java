class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        k = k%n;
        for(int i=0; i<n; i++) {
            int pos = n-k+i;
            if(pos < n) arr[i] = nums[pos];
            else arr[i] = nums[pos-n];
        }
        for(int i=0; i<n; i++) {
            nums[i] = arr[i];
        }

    }
}