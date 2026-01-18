class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        int size = grid.length*grid.length;
        for(int i=1; i<=size; i++) {
            int count = 0;
            for(int j=0; j<grid.length; j++) {
                for(int k=0; k<grid.length; k++) {
                    if(grid[j][k] == i) count++;
                }
            }
            if(count == 2) result[0]=i;
            if(count == 0) result[1]=i;
        }
        return result;
    }
}