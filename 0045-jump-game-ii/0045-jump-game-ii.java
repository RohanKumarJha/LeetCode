class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        if(len == 1) return 0;
        int flag=0, count=0;
        int i=0;
        while(i < len) {
            int maxPosition = i;
            while(i <= flag) {
                maxPosition = Math.max(nums[i]+i, maxPosition);
                i++;
            }
            flag = maxPosition;
            count++;
            if(flag >= len-1) return count;;
        } return count;
    }
}