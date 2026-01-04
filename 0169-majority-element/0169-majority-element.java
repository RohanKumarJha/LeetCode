class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        for(int i=0; i<size; i++) {
            int count = 0;
            int num = nums[i];
            for(int j=i; j<size; j++) {
                if(nums[j] == num) count++;
            }
            if(count > size/2) return num;
        }
        return 0;
    }
}