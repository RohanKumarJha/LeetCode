class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
                break;
            }
        } if(count == 0) return false;
        return true;
    }
}