class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int count=0;
        int answer = nums[0];
        for(int i=1; i<len; i++) {
            if(answer == nums[i]) count++;
            else {
                count--;
                if(count < 0) {
                    answer = nums[i];
                    count++;
                }
            }
        } return answer;
    }
}