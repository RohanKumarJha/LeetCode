class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int idx = 0;
        for(int i=m; i<len; i++) {
            nums1[i] = nums2[idx];
            idx++;
        }
        Arrays.sort(nums1);
    }
}