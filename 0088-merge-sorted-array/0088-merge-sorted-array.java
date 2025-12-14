class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int pointer1=0, pointer2=0;
        int pointer=0;
        while(pointer1<m && pointer2<n) {
            if(nums1[pointer1] < nums2[pointer2]) {
                arr[pointer++] = nums1[pointer1++];
            } else {
                arr[pointer++] = nums2[pointer2++];
            }
        }
        while(pointer1 < m) {
            arr[pointer++] = nums1[pointer1++];
        }
        while(pointer2 < n) {
            arr[pointer++] = nums2[pointer2++];
        }

        for(int i=0; i<m+n; i++) {
            nums1[i] = arr[i];
        }
    }
} 