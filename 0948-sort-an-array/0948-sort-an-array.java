class Solution {
    public void conquor(int[] nums,int start,int mid,int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = nums[start + i];
        for (int i = 0; i < n2; i++) right[i] = nums[mid + 1 + i];

        int i = 0, j = 0, k = start;

        // Merge back into nums
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) nums[k++] = left[i++];
        while (j < n2) nums[k++] = right[j++];
    }

    public void divide(int[] nums,int start,int end) {
        if(start == end) return ;
        int mid = start+(end-start)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        conquor(nums,start,mid,end);
    }

    public int[] sortArray(int[] nums) {
        int start=0, end=nums.length-1;
        divide(nums,start,end);
        return nums;
    }
}