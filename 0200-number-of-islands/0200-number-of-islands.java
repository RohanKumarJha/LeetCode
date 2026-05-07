class Solution {
    private void checkIsland(char[][] grid,int row, int col) {
        if(row>=grid.length || col>=grid[0].length || row<0 || col<0 || grid[row][col] != '1') return;
        grid[row][col] = '$';
        checkIsland(grid,row+1,col);
        checkIsland(grid,row-1,col);
        checkIsland(grid,row,col+1);
        checkIsland(grid,row,col-1);
    }

    public int numIslands(char[][] grid) {
        int no_of_islands = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    checkIsland(grid,i,j);
                    no_of_islands += 1;
                }
            }
        }
        return no_of_islands;
    }
}