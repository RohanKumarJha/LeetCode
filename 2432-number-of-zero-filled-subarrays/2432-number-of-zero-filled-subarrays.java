class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        long indexOfzeroes = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                indexOfzeroes++;
                result += indexOfzeroes;
            } else {
                indexOfzeroes = 0;
            }
        } return result;
    }
}