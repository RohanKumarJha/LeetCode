class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] arr1 = new long[n];
        long[] arr2 = new long[n];
        for(int i=0; i<n; i++) {
            if(i==0) arr1[i] = nums[i];
            else arr1[i] = arr1[i-1]+nums[i];
        }
        for(int i=n-1; i>=0; i--) {
            if(i==n-1) arr2[i]=nums[i];
            else arr2[i]=arr2[i+1]+nums[i];
        }
        int count=0;
        for(int i=0; i<n-1; i++) {
            if(arr1[i]>=arr2[i+1]) count++;
        } return count;
    }
}