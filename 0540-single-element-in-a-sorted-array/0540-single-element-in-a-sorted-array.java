class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        int s=0, e=n-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(s==e) return arr[mid];
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            else if(arr[mid]==arr[mid-1] && mid%2==0) {
                e = mid-2;
            } else if(arr[mid]==arr[mid-1] && mid%2!=0) {
                s = mid+1;
            } else if(arr[mid]==arr[mid+1] && mid%2==0) {
                s = mid+2;
            } else if(arr[mid]==arr[mid+1] && mid%2!=0) {
                e = mid-1;
            }
        } return 0;
    }
}