class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer=0;
        int count=1;
        int i=1;
        while(i < nums.length) {
            if(nums[i] != nums[i-1]) {
                if(count == 1) {
                    nums[pointer++] = nums[i-1];
                } else {
                    nums[pointer++] = nums[i-1];
                    nums[pointer++] = nums[i-1];
                } count=1;
            } else {
                count++;
            } i++;
        } if(count == 1) {
            nums[pointer++] = nums[i-1];
        } else {
            nums[pointer++] = nums[i-1];
            nums[pointer++] = nums[i-1];
        } return pointer;
    }
}