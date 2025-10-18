class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i : nums) {
            sum += i;
        }
        int result = ((n+1)*(n))/2;
        return result-sum;
    }
}