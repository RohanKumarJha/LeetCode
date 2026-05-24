class Solution {

    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // Increasing part
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

            // Decreasing part
            else {
                end = mid;
            }
        }

        return start;
    }
}