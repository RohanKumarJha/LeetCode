class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            int result = -1;
            int pointer = 0;
            while(nums2[pointer] != nums1[i]) {
                pointer++;
            }
            for(int j=pointer+1; j<nums2.length; j++) {
                if(nums1[i] < nums2[j]) {
                    result = nums2[j];
                    break;
                }
            } arr[i] = result;
        } return arr;
    }
}