class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int[] rowDiff = new int[R];
        int[] colDiff = new int[C];
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                if(grid[i][j] == 1) {
                    rowDiff[i]++;
                    colDiff[j]++;
                } else {
                    rowDiff[i]--;
                    colDiff[j]--;
                }
            }
        }

        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                grid[i][j] = rowDiff[i] + colDiff[j];
            }
        } return grid;
    }
}