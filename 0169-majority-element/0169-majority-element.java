class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        int count = 1;
        for(int i=1; i<size; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                if(count > size/2) return nums[i-1];
                count = 1;
            }
        } return nums[size-1];
    }
}