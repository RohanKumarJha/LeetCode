class Solution {
    public void island(char[][] grid,int row,int col) {
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]=='0') return ;
        grid[row][col] = '0';
        island(grid,row+1,col);
        island(grid,row-1,col);
        island(grid,row,col+1);
        island(grid,row,col-1);
    }

    public int numIslands(char[][] grid) {
        int result = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    island(grid,i,j);
                    result++;
                }
            }
        } return result;
    }
}