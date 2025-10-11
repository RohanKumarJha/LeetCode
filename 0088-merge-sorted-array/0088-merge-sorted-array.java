class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m+n-1;
        int pos1=m-1, pos2=n-1;
        while(pos2 != -1) {
            if(pos1 == -1) {
                nums1[pos--] = nums2[pos2--];
            } else if(pos2 == -1) {
                break;
            } else if(nums1[pos1] < nums2[pos2]) {
                nums1[pos--] = nums2[pos2--];
            } else {
                nums1[pos--] = nums1[pos1--];
            }
        }
    }
}