class Solution {
    public int countPartitions(int[] nums) {
        int size = nums.length;
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        return (sum % 2 == 0) ? size-1 : 0;
    }
}