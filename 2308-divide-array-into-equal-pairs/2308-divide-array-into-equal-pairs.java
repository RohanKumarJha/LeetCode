class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>0; i-=2) {
            if(nums[i] != nums[i-1]) return false;
        } return true;
    }
}