class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int count=1, element=nums[0];
        for(int i=1; i<len; i++) {
            if(nums[i] != element & count>0) {
                count--;
            } else if(nums[i] != element & count==0) {
                element = nums[i];
                count=1;
            } else {
                count++;
            }
        } return element;
    }
}