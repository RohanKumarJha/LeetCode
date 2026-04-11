class Solution {
    private void island(char[][] grid,int curr_row, int curr_col, int row, int col) {
        if(curr_row==row || curr_col==col || curr_row==-1 || curr_col==-1) return ;
        if(grid[curr_row][curr_col] != '1') return ;
        grid[curr_row][curr_col] = '$';
        island(grid, curr_row-1, curr_col, row, col);
        island(grid, curr_row+1, curr_col, row, col);
        island(grid, curr_row, curr_col-1, row, col);
        island(grid, curr_row, curr_col+1, row, col);
    }

    public int numIslands(char[][] grid) {
        int no_of_island = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(grid[i][j] == '1') {
                    island(grid,i,j,row,col);
                    no_of_island++;
                }
            }
        }
        return no_of_island;
    }
}