class Solution {
    public int numberOfMatches(int n) {
        int sum = 0, i=n;
        while(i>1) {
            if(i%2==0) {
                sum += i/2;
                i = i/2;
            } else {
                sum += (i-1)/2;
                i = (i-1)/2+1;
            }
        } return sum;
    }
}