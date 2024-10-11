class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=1; i<n; i++) {
            if(nums[i]-nums[i-1]<0) count++;
        }
        if(count == 0) return true;
        if(count==1 && (nums[0]>=nums[n-1])) return true;
        return false;
    }
}