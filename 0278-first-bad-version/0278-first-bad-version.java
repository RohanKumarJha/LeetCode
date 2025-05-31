public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=0, e=n;
        while(s <= e) {
            int mid = s+(e-s)/2;
            boolean temp = isBadVersion(mid);
            if(temp) {
                e=mid-1;
            } else {
                s=mid+1;
            }
        } return s;
    }
}