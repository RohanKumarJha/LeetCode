class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end1=m-1, end2=n-1;
        for(int i=m+n-1; i>=0; i--) {
            if(end1 < 0) {
                nums1[i] = nums2[end2--];
            } else if(end2 < 0) {
                nums1[i] = nums1[end1--];
            } else if(nums1[end1] > nums2[end2]) {
                nums1[i] = nums1[end1--];
            } else if(nums1[end1] <= nums2[end2]) {
                nums1[i] = nums2[end2--];
            }
        } 
    }
}