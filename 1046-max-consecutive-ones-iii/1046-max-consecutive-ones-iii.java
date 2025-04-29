class Solution {
    public int longestOnes(int[] nums, int k) {
        int result=0;
        int start=0, end=0;
        int count=0;
        while(end != nums.length) {
            if(nums[end] == 1) {
                count++; 
                end++;
            } else if(nums[end] == 0) {
                if(k > 0) {
                    count++;
                    k--;
                    end++;
                } else {
                    result = Math.max(result,count);
                    start++;
                    if(nums[start-1]==0) {
                        end++;
                    } else {
                        count--;
                    }
                }
            }
        } return result = Math.max(result,count);
    }
}