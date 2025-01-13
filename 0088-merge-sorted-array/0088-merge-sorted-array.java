class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int index1 = m-1;
        int index2 = n-1;
        for(int i=len-1; i>=0; i--) {
            if(index1 == -1) {
                nums1[i] = nums2[index2];
                index2--;
            } else if(index2 == -1) {
                nums1[i] = nums1[index1];
                index1--;
            } else if(nums1[index1]>nums2[index2]) {
                nums1[i] = nums1[index1];
                index1--;
            } else if(nums1[index1]<=nums2[index2]) {
                nums1[i] = nums2[index2];
                index2--;
            }
        }
    }
}