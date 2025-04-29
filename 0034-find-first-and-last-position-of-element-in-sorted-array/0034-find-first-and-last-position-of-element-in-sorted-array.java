class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccu=-1, lastOccu=-1;

        // Find the first occurence
        int start=0;
        int end=nums.length-1;
        boolean flag = false;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(nums[mid] == target) {
                flag = true;
                end = mid-1;
            } else if(nums[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        if(flag) {
            firstOccu = end+1;
        } else {
            return new int[]{-1,-1};
        }


        // Find the last occurence
        start=0;
        end=nums.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(nums[mid] == target) {
                start = mid+1;
            } else if(nums[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        } lastOccu = start-1;
        return new int[]{firstOccu,lastOccu};
    }
}