class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int pointer = 0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                result[pointer++] = nums[i];
                if(pointer == 2) return result;
            }
        } return result;
    }
}