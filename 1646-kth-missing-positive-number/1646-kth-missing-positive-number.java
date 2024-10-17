class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int i=0;
        int val=0;
        while(k!=0 && i<n) {
            val++;
            if(arr[i]!=val) k--;
            else i++;
        } 
        if(k==0) return val;
        return val+k;
    }
}