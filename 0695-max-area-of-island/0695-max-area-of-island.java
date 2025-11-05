class Solution {
    private int result = 0;
    private int answer = 0;

    private void choose(int[][] grid,int i,int j) {
        if(i==-1 || j==-1 || i==grid.length || j==grid[0].length || grid[i][j]!=1) return ;
        if(grid[i][j] == 1) {
            answer++;
            grid[i][j] = 0;
        }
        choose(grid,i-1,j);
        choose(grid,i+1,j);
        choose(grid,i,j-1);
        choose(grid,i,j+1);
    }

    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    choose(grid,i,j);
                    result = Math.max(result,answer);
                    answer = 0;
                }
            }
        } return result;
    }
}