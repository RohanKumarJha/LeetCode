class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] arr = new int[m+n];
        int pos = 0;
        for(int i=0; i<m; i++) {
            arr[pos++] = nums1[i];
        }
        for(int i=0; i<n; i++) {
            arr[pos++] = nums2[i];
        }
        Arrays.sort(arr);
        if(arr.length % 2 != 0) {
            return (double)arr[(m+n)/2];
        } return (double)(arr[(m+n-1)/2]+arr[(m+n-1)/2+1])/2;
    }
}