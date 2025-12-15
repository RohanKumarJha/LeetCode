class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int pointer = 0;
        for(int i : nums) {
            if(i != 0) {
                arr[pointer++] = i;
            }
        }
        for(int i=0; i<arr.length; i++) {
            nums[i] = arr[i];
        }
    }
}