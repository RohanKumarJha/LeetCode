class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int total = n * n;

        long actualSum = (long) total * (total + 1) / 2;
        long actualSqSum = (long) total * (total + 1) * (2L * total + 1) / 6;

        long currSum = 0;
        long currSqSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                currSum += grid[i][j];
                currSqSum += (long) grid[i][j] * grid[i][j];
            }
        }

        long diff = currSum - actualSum;  
        // repeated - missing

        long sqDiff = currSqSum - actualSqSum;
        // repeated² - missing²

        long sum = sqDiff / diff;
        // repeated + missing

        int repeated = (int) ((diff + sum) / 2);
        int missing = (int) (sum - repeated);

        return new int[]{repeated, missing};
    }
}