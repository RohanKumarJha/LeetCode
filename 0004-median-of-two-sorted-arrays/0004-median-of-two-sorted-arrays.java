class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] arr = new int[m+n];
        int pos1=0, pos2=0, pos=0;
        while(pos < arr.length) {
            if(pos1 == m) {
                arr[pos++] = nums2[pos2++];
            } else if(pos2 == n) {
                arr[pos++] = nums1[pos1++];
            } else {
                if(nums1[pos1] < nums2[pos2]) {
                    arr[pos++] = nums1[pos1++];
                } else {
                    arr[pos++] = nums2[pos2++];
                }
            }
        }
        if(arr.length % 2 != 0) {
            return (double)arr[(m+n)/2];
        } return (double)(arr[(m+n-1)/2]+arr[(m+n-1)/2+1])/2;
    }
}