class Solution {
    public int finalAns(int[] arr,int n,int mid) {
        int ans=0;
        for(int i=0; i<n; i++) {
            ans += Math.ceil((double)arr[i]/(double)mid);
        } return ans;
    }
    public int max(int[] arr,int n){
        int max = arr[0];
        for(int i=1; i<n; i++) {
            max = Math.max(max,arr[i]);
        } return max;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int s=1,e=max(nums,n);
        if(n==threshold) return e;
        while(s<=e) {
            int mid=s+(e-s)/2;
            int val =finalAns(nums,n,mid);
            if(val <= threshold) e=mid-1;
            else s=mid+1;
        } return s;
    } 
}