class Solution {
    public int checkArray(int[] arr,int mid) {
        int val = 0;
        for(int i=0; i<arr.length; i++) {
            val += Math.ceil((double)arr[i]/(double)mid);
        } return val;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s=1, e=Integer.MAX_VALUE;
        while(s<=e) {
            int mid=s+(e-s)/2;
            int val = checkArray(piles,mid);
            if(h == val) {
                e=mid-1;
            } else if(h<val) {
                s=mid+1;
            } else {
                e=mid-1;
            }
        } return s;
    }
}