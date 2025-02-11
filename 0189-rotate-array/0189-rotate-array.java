class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] arr = new int[len];
        int idx = len-(k%len);
        for(int i=0; i<len; i++) {
            arr[i] = (idx<len)?nums[idx]:nums[idx%len];
            idx++;
        } 
        for(int i=0; i<len; i++) {
            nums[i] = arr[i];
        }
    }
}