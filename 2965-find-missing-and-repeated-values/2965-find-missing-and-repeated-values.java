class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long size = grid.length * grid.length;
        long actual_sum = size*(size+1)/2;
        long actual_square_sum = size*(size+1)*(2*size+1)/6;
        long sum = 0;
        long square_sum = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid.length; j++) {
                sum += grid[i][j];
                square_sum += (grid[i][j]*grid[i][j]);
            }
        }
        long missing = ((actual_sum - sum) + ((actual_square_sum-square_sum)/(actual_sum-sum)))/2;
        long duplicate = missing - (actual_sum-sum);

        return new int[]{(int)duplicate,(int)missing};
    }
}