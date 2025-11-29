class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        int value = nums[0];
        int count = 1;
        int result = 1;
        int pointer = 1;

        for(int i=1; i<n; i++) {
            if(nums[i] == value) {
                if(count != 2)  {
                    nums[pointer++] = nums[i];
                    count++;
                    result++;
                }
            } else {
                value = nums[i];
                nums[pointer++] = nums[i];
                count = 1;
                result++;
            }
        }

        return result;
    }
}