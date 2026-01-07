class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int size = arr.length;
        int start=0, end=size-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid == 0) {
                if(end == mid) {
                    return arr[mid];
                } else {
                    return (arr[mid] > arr[mid+1]) ? mid : mid+1;
                }
            } else if(mid == size-1) {
                if(start == mid) {
                    return arr[mid];
                } else {
                    return (arr[mid] < arr[mid-1]) ? mid-1 : mid;
                }
            } else {
                if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]) {
                    return mid;
                } else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        } return 0;
    }
}