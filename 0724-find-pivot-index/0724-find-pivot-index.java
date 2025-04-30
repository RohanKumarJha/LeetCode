class Solution {
    public int pivotIndex(int[] nums) {
        int left=0, right=0;
        for(int i=1; i<nums.length; i++) {
            right += nums[i];
        }
        int i=0;
        while(left != right && i!=nums.length-1) {
            left += nums[i];
            right -= nums[i+1];
            i++;
            if(right == left) return i;
        } return (left==right) ? 0 : -1;
    }
}