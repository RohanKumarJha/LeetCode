class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxVal = Integer.MIN_VALUE;
        for(int i : piles) {
            maxVal = Math.max(maxVal, i);
        }

        int start=1, end=maxVal;
        int result = Integer.MAX_VALUE;
        while(start <= end) {
            int mid = start+(end-start)/2;
            int time = h;
            for(int i : piles) {
                double answer = Math.ceil((double)i/mid);
                time -= answer;
                if(time < 0) {
                    start = mid+1;
                    break;
                }
            }
            if(time >= 0) {
                result = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        } return result;

    }
}