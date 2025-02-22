class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        int[] arr = new int[len];
        for(int i=0; i<len; i++) {
            arr[i] = nums[(len-k+i)%len];
        } 
        int idx = 0;
        for(int i : arr) {
            nums[idx++] = i;
        }
    }
}