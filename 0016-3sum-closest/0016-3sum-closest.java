class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int diff = Integer.MAX_VALUE;
        int result = 0;
        for(int i=0; i<len-2; i++) {
            int j=i+1, k=len-1;
            while(j < k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target) {
                    return target;
                } else if(sum < target) {
                    if(target-sum < diff) {
                        result = sum;
                        diff = target-sum;
                    } j++;
                } else {
                    if(sum-target < diff) {
                        result = sum;
                        diff = sum-target;
                    } k--;
                }
            }
        } return result;
    }
}