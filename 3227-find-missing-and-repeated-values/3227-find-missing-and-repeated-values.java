class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        long expectedSum = (long) N * (N + 1) / 2;
        long expectedSquareSum = (long) N * (N + 1) * (2L * N + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long x = grid[i][j];
                actualSum += x;
                actualSquareSum += x * x;
            }
        }

        long diff1 = actualSum - expectedSum; // repeating - missing
        long diff2 = actualSquareSum - expectedSquareSum; // repeating^2 - missing^2

        long sumRM = diff2 / diff1; // repeating + missing

        int repeating = (int) ((diff1 + sumRM) / 2);
        int missing = (int) (sumRM - repeating);

        return new int[]{repeating, missing};
    }
}
