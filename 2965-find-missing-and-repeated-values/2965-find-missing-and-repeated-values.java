class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length;
        int[] result = new int[2];
        for(int value=1; value<=size*size; value++) {
            int count = 0;
            for(int i=0; i<size; i++) {
                for(int j=0; j<size; j++) {
                    if(grid[i][j] == value) count+=1;
                }
            }
            if(count == 0) {
                result[1] = value;
            } else if(count == 2) {
                result[0] = value;
            }
        }
        return result;
    }
}