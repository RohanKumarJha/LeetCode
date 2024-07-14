public class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long ans = 0;
        int[] l = new int[n];
        int[] r = new int[n];
        int s = nums[0];
        
        for (int i = 1; i < n; i++) {
            l[i] = s;
            s = Math.max(s, nums[i]);
        }
        
        s = nums[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            r[i] = s;
            s = Math.max(s, nums[i]);
        }
        
        for (int i = 1; i < n - 1; i++) {
            long k = (long) (l[i] - nums[i]) * r[i];
            ans = Math.max(ans, k);
        }
        
        return ans;
    }
}