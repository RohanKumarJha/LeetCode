class Solution {
    public int longestOnes(int[] nums, int k) {
        int result = 0;
        for(int i=0; i<nums.length; i++) {
            int noOfK = k;
            int count = 0;
            for(int j=i; j<nums.length; j++) {
                if(nums[j]==1) {
                    count++;
                } else {
                    if(noOfK > 0) {
                        count++;
                        noOfK--;
                    } else break;
                }
            } result = Math.max(result,count);
        } return result;
    }
}