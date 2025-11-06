class Solution {
    private int max_area = 0;
    private int area = 0;

    private void findArea(int[][] grid,int i,int j) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=1) return ;
        if(grid[i][j] == 1) {
            area += 1;
            grid[i][j] = 0;
        }
        findArea(grid,i-1,j);
        findArea(grid,i+1,j);
        findArea(grid,i,j-1);
        findArea(grid,i,j+1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    findArea(grid,i,j);
                    max_area = Math.max(max_area,area);
                    area = 0;
                }
            }
        } return max_area;
    }
}