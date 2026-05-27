class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int size = arr.length;
        int start=0, end=size-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid == 0) {
                return (arr[mid]<arr[mid+1]) ? mid+1 : mid;
            } else if(mid == size-1) {
                return (arr[mid]<arr[mid-1]) ? mid-1 : mid;
            } else {
                if(arr[mid-1]<arr[mid] & arr[mid]>arr[mid+1]) {
                    return mid;
                } else if(arr[mid-1] < arr[mid]) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return start;
    }
}