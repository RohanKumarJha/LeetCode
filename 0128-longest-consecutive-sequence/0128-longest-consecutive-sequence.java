class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max = 0;
        int tot = 0;
        if(n == 0) return 0;
        for(int i=1; i<n; i++) {
            if(nums[i]-nums[i-1]==1) {
                tot++;
            } else if(nums[i]-nums[i-1]==0) {
                continue;
            } else {
                tot = 0;
            }
            max = Math.max(tot,max);
        } return max+1;
    }
}