class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] array = new int[nums.length];
        Arrays.fill(array, 1);

        int prefix = 1;
        for(int i=0; i<nums.length; i++) {
            array[i] *= prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for(int i=nums.length-1; i>=0; i--) {
            array[i] *= postfix;
            postfix *= nums[i];
        } return array;
    }
}