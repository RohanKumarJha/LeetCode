class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int size = arr.length;
        int start=0, end=size-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(start == mid) {
                if(arr[start] < arr[end]) {
                    return end;
                } else {
                    return start;
                }
            }
            if(arr[mid-1]<=arr[mid] && arr[mid]>=arr[mid+1]) {
                return mid;
            } else if(arr[mid-1] > arr[mid]) {
                end = mid;
            } else {
                start = mid+1;
            }
        } return 0;
    }
}