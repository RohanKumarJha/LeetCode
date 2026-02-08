class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<=n; i++) {
            boolean flag = true;
            for(int j=0; j<n; j++) {
                if(i == nums[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                return i;
            }
        }
        return 0;
    }
}