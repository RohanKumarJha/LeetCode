class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        for(int i : nums) {
            if(i == 1) {
                count++;
            } else {
                result = Math.max(count, result);
                count = 0;
            }
        } result = Math.max(count, result);
        return result;
    }
}