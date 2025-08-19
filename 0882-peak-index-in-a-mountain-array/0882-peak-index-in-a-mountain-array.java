class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length == 1) return arr[0];

        int start=0, end=arr.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(start == mid) {
                if(arr[mid] < arr[mid+1]) {
                    return mid+1;
                } else {
                    return mid;
                }
            }
            if(mid == end) {
                return end;
            }
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]) {
                return mid;
            } else if(arr[mid] < arr[mid+1]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        } return start;
    }
}