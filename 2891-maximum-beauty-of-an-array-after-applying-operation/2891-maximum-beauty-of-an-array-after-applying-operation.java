class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum=0, max=0;
        int s=0, e=0;
        while(e<n) {
            if(nums[e]-k <= nums[s]+k) {
                sum += 1;
                e += 1;
            } else {
                sum -= 1;
                s += 1;
            }
            max = Math.max(max,sum);
        } return max;
    }
}