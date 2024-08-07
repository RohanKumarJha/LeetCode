class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[2*n];
        for(int i=0; i<2*n; i++) {
            if(i < n) {
                newArr[i] = nums[i];
            } else {
                newArr[i] = nums[i-n];
            }
        } return newArr;
    }
}