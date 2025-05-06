class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        int idx = 0;
        for(int i : nums) {
            arr[idx] = nums[i];
            idx++;
        } return arr;
    }
}