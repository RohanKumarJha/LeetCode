class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long N = (long) n * n;  // total elements
        long expectedSum = N * (N + 1) / 2;
        long expectedSqSum = N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0, actualSqSum = 0;
        for (int[] row : grid) {
            for (int val : row) {
                actualSum += val;
                actualSqSum += (long) val * val;
            }
        }

        long diff = actualSum - expectedSum;          // x - y
        long sqDiff = actualSqSum - expectedSqSum;    // x² - y² = (x - y)(x + y)

        long sum = sqDiff / diff;                     // x + y

        long x = (diff + sum) / 2;  // repeated
        long y = sum - x;           // missing

        return new int[]{(int) x, (int) y};
    }
}
