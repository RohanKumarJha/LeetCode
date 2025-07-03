class Solution {
    public int timeTaken(int[] piles, int mid) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += Math.ceil((double)piles[i] / mid);
        }
        return time;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxElm = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxElm = Math.max(maxElm, piles[i]);
        }

        int start = 1, end = maxElm;
        int answer = maxElm;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int totalTime = timeTaken(piles, mid);
            if (totalTime <= h) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }
}