class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos1=m-1, pos2=n-1;
        for(int i=m+n-1; i>=0; i--) {
            if(pos2 < 0) {
                break;
            } else if(pos1 < 0) {
                nums1[i]=nums2[pos2--]; 
            } else if(nums1[pos1] < nums2[pos2]) {
                nums1[i]=nums2[pos2--];
            } else {
                nums1[i]=nums1[pos1--];
            }
        }
    }
}