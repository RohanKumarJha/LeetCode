
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1;
        int e = n;
        while(s <= e) {
            int mid = s+(e-s)/2;
            int pick = guess(mid);
            if(pick == 1) s = mid+1;
            else if(pick < 0) e = mid-1;
            else return mid;
        } return 0;
    }
}