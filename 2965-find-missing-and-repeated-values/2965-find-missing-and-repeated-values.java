class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long size = grid.length*grid.length;
        long actual_sum = size*(size+1)/2;
        long curr_sum = 0;
        long actual_sq_sum = size*(size+1)*(2*size+1)/6;
        long curr_sq_sum = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid.length; j++) {
                curr_sum += grid[i][j];
                curr_sq_sum += (grid[i][j]*grid[i][j]);
            }
        }
        long missing_value = ( (actual_sq_sum - curr_sq_sum)/(actual_sum - curr_sum) + (actual_sum - curr_sum) )/2;
        long duplicate_value = ( (actual_sq_sum - curr_sq_sum)/(actual_sum - curr_sum) - (actual_sum - curr_sum) )/2;

        return new int[]{(int) duplicate_value, (int) missing_value};
    }
}