class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];
        for(int i=0; i<n; i++) {
            int value = 0;
            for(int j=0; j<n; j++) {
                if(nums[i] > nums[j]) {
                    value++;
                }
            } newArr[i] = value;
        } return newArr;
    }
}