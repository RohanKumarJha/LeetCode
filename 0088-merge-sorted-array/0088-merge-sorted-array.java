class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer = m+n-1;
        int start = m-1, end=n-1;
        while(pointer >= 0) {
            if(start == -1) {
                nums1[pointer--] = nums2[end--];
            } else if(end == -1) {
                break;
            } else {
                if(nums1[start] > nums2[end]) {
                    nums1[pointer--] = nums1[start--];
                } else {
                    nums1[pointer--] = nums2[end--];
                }
            }
        }
    }
}