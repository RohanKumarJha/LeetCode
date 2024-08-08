class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            int val = 0;
            int num = nums[i];
            while(num > 0) {
                val++;
                num /= 10;
            }
            if(val % 2 == 0) {
                count++;
            }
        } return count++;
    }
}