class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];
        for(int i=0; i<n; i++) {
            if(i==0) {
                newArr[i] = nums[i];
            } else {
                newArr[i] = nums[i]+newArr[i-1];
            }
        } return newArr;
    }
}