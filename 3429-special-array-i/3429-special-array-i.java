class Solution {
    public boolean isArraySpecial(int[] nums) {
        int len = nums.length;
        boolean flag = nums[0]%2==0 ? true : false;
        for(int i=1; i<len; i++) {
            if(nums[i]%2==0 & flag==false) {
                flag = true;
            } else if(nums[i]%2!=0 & flag==true) {
                flag = false;
            } else return false;
        } return true;
    }
}