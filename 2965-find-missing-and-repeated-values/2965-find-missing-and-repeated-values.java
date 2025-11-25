class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int missing_number = 0;
        int repeating_number = 0;
        long sum = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(set.contains(grid[i][j])) {
                    repeating_number = grid[i][j];
                    sum -= repeating_number;
                } else {
                    set.add(grid[i][j]);
                }
                sum += grid[i][j];
            }
        }

        long acutal_sum = grid.length*grid.length*(grid.length*grid.length+1)/2;
        missing_number = (int) (acutal_sum - sum);

        int[] arr = new int[2];
        arr[0] = repeating_number;
        arr[1] = missing_number;
        return arr;
    }
}