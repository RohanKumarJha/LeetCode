class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i; j<nums.length; j++) {
                int diff = nums[i]-nums[j];
                if(diff < 0) {
                    if(-diff == k) count++;
                } else {
                    if(diff == k) count++;
                }
            }
        } return count;
    }
}