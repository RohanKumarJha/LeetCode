class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int num=nums[0], count=1;
        for(int i=1; i<len; i++) {
            if(nums[i]!=num) {
                if(count == 0) {
                    num = nums[i];
                    count++;
                } else {
                    count--;
                }
            } else {
                count++;
            }
        } return num;
    }
}