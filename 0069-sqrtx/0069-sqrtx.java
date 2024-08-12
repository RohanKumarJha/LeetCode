class Solution {
    public static int binarySearch(int x) {
        int s = 1;
        int e = x;
        int mid = e+(s-e)/2;
        while(s <= e) {
            if(mid == x/mid) return mid;
            else if(mid < x/mid) s = mid+1;
            else e = mid-1;
            mid = e+(s-e)/2;
        } return e;
    }
    public int mySqrt(int x) {
        return binarySearch(x);
    }
}