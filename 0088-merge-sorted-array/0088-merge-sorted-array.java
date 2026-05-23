import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m + n];

        // copy nums1 valid elements
        for(int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        // copy nums2 elements
        for(int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }

        // sort merged array
        Arrays.sort(arr);

        // copy back to nums1
        for(int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}