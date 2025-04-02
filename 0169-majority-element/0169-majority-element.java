class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int count = 1;
        int result = nums[0];
        for(int i=1; i<len; i++) {
            if(result==nums[i]) count++;
            else if(result!=nums[i] & count==0) {
                result = nums[i];
                count = 1;
            }  else {
                count--;
            }
        } return result;
    }
}