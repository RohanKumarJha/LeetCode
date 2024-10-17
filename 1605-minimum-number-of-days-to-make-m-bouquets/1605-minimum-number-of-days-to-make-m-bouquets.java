class Solution {
    public int bloom(int[] arr,int m,int k,int mid) {
        int value=m,ans=k;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<=mid) {
                ans--;
                if(ans==0) {
                    value--;
                    ans = k;
                }
            } else {
                ans=k;
            }
        } return value;
    }
    public int maxVal(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            max = Math.max(max,arr[i]);
        } return max;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int s=1,e=maxVal(bloomDay),maxValue=maxVal(bloomDay);
        while(s<=e) {
            int mid = s+(e-s)/2;
            int val = bloom(bloomDay,m,k,mid);
            if(val <= 0) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        } if(s>maxValue) return -1;
        return s;
    }
}