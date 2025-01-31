class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int answer = nums[0];
        int result = 0;
        for(int i=0; i<len; i++) {
            if(answer == nums[i]) result++;
            else if(answer!=nums[i]) {
                result--;
                if(result < 0) {
                    answer = nums[i];
                    result++;
                }
            }
        } return answer;
    }
}