class Solution {
    public int missingNumber(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        for(int i : nums) {
            arr[i] = true;
        }
        for(int i=0; i<arr.length; i++) {
            if(!arr[i]) return i;
        } return 0;
    }
}