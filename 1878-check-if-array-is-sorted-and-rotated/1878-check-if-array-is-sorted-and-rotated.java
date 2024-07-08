class Solution {
    public boolean check(int[] nums) {
        int count = 0, n=nums.length;
        for(int i=1; i<n; i++) {
            if((nums[i]-nums[i-1]) < 0 ) {
                if(nums[n-1]-nums[0]>0) {
                    count++;
                }
                count++;
            } 
        } 
        if((count==0 || count==1)) {
            return true;
        } return false;
    }
}