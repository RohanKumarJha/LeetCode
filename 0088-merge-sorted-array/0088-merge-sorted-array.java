class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m+n-1;
        int pointer2 = m-1;
        int pointer3 = n-1;
        while(pointer2>=0 && pointer3>=0) {
            if(nums1[pointer2] < nums2[pointer3]) {
                nums1[pointer1--] = nums2[pointer3--];
            } else {
                nums1[pointer1--] = nums1[pointer2--];
            }
        }
        while(pointer2>=0) {
            nums1[pointer1--] = nums1[pointer2--];
        }
        while(pointer3>=0) {
            nums1[pointer1--] = nums2[pointer3--];
        }
    }
}