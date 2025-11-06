class Solution {
    private void checkIsland(char[][] grid,int i,int j) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!='1') return ;
        grid[i][j] = '$';
        checkIsland(grid,i+1,j);
        checkIsland(grid,i-1,j);
        checkIsland(grid,i,j-1);
        checkIsland(grid,i,j+1);
    }

    public int numIslands(char[][] grid) {
        int noOfIslands = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    checkIsland(grid,i,j);
                    noOfIslands += 1;
                }
            }
        } return noOfIslands;
    }
}