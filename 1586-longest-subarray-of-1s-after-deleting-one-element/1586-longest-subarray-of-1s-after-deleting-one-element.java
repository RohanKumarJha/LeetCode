class Solution {
    public int longestSubarray(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++) {
            int count = 0;
            boolean flag = false;
            for(int j=i; j<nums.length; j++) {
                if(nums[j]==1) {
                    count++;
                } else if(nums[j]==0 && flag==false) {
                    flag = true;
                } else if(flag) {
                    break;
                }
            } if(!flag) {
                count--;
            }
            result = Math.max(result,count);
        } return result;
    }
}