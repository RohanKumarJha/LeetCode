class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length;
        int maxElm = 0;
        for(int i=0; i<n; i++) {
            maxElm = Math.max(maxElm, nums[i]);
        }

        int s=1, e=maxElm;
        int ans = 0;
        while(s < e) {
            int result = 0;
            int mid = (e-s)/2+s;
            for(int i=0; i<n; i++) {
                if(nums[i] >= mid) {
                    if(nums[i] % mid == 0) {
                        result += (nums[i]/mid-1);
                    } else {
                        result += nums[i]/mid; 
                    }
                }
            }
            if(result <= maxOperations) {
                e = mid;
                ans = mid;
            } else {
                s = mid+1;
            }
        } return e;
    }
}