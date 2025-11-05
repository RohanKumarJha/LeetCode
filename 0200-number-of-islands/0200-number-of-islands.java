class Solution {
    private void check(char[][] grid,int i,int j) {
        if(i==-1 || j==-1 || i==grid.length || j==grid[0].length || grid[i][j]!='1') return ;
        grid[i][j] = '$';
        check(grid,i-1,j);
        check(grid,i+1,j);
        check(grid,i,j-1);
        check(grid,i,j+1);
    }

    public int numIslands(char[][] grid) {
        int result = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    check(grid,i,j);
                    result++;
                }
            }
        } return result;
    }
}