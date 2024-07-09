class Solution {
    public int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int sum = 0;
            for(int j=0; j<=i; j++) {
                sum += nums[j];
            } newArr[i] = sum;
        } return newArr;
    }
}