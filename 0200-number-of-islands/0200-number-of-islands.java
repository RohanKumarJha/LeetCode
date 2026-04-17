class Solution {
    private void island(char[][] grid,int row, int col) {
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col] != '1') return;
        if(grid[row][col] == '1') {
            grid[row][col] = '0';
        }
        island(grid, row+1, col);
        island(grid, row-1, col);
        island(grid, row, col+1);
        island(grid, row, col-1);
    }

    public int numIslands(char[][] grid) {
        int number_of_island = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    island(grid,i,j);
                    number_of_island += 1;
                }
            }
        }
        return number_of_island;
    }
}