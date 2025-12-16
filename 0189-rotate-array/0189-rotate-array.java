class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        int[] arr = new int[n];
        int pointer = 0;
        int pointer2 = n-k;
        while(pointer2 < n) {
            arr[pointer++] = nums[pointer2++];
        }
        pointer2 = 0;
        while(pointer < n) {
            arr[pointer++] = nums[pointer2++];
        }

        for(int i=0; i<n; i++) {
            nums[i] = arr[i];
        }
    }
}