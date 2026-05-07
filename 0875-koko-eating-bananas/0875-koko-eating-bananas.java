class Solution {

    private long findHours(int[] piles, int speed) {

        long hours = 0;

        for (int bananas : piles) {

            hours += (bananas + speed - 1) / speed;
        }

        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = Integer.MIN_VALUE;

        for (int bananas : piles) {
            end = Math.max(end, bananas);
        }

        int result = end;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            long hours = findHours(piles, mid);

            if (hours <= h) {

                result = mid;

                end = mid - 1;

            } else {

                start = mid + 1;
            }
        }

        return result;
    }
}