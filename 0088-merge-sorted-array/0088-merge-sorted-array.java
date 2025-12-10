class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m-1, pointer2 = n-1;
        int pointer = m+n-1;

        while(pointer >= 0) {
            if(pointer2==-1) {
                break;
            } else if(pointer1==-1) {
                nums1[pointer--] = nums2[pointer2--];
            } else if(nums1[pointer1] < nums2[pointer2]) {
                nums1[pointer--] = nums2[pointer2--];
            } else {
                nums1[pointer--] = nums1[pointer1--];
            }
        }
    }
}