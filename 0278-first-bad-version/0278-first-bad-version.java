
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 1, e = n;
        while(s <= e) {
            int mid = s+(e-s)/2;
            boolean fin = isBadVersion(mid);
            if(fin == true) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        } return s;
    }
}