class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0, end=arr.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(mid == 0) {
                if(arr[mid] > arr[mid+1]) {
                    return mid;
                } else {
                    start = mid+1;
                }
            } else if(mid == arr.length-1) {
                if(arr[mid] > arr[mid-1]) {
                    return mid;
                } else {
                    end = mid-1;
                }
            } else {
                if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
                    return mid;
                } else if(arr[mid-1]>arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        } return 0;
    }
}