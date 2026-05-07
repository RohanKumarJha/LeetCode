class Solution {
    private int area = 0;
    private int max_area = 0; 

    private void maxArea(int[][] grid,int row,int col) {
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]!=1) return;
        grid[row][col] = 0;
        area += 1;
        maxArea(grid,row+1,col);
        maxArea(grid,row-1,col);
        maxArea(grid,row,col+1);
        maxArea(grid,row,col-1);
    }

    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                maxArea(grid,i,j);
                max_area = Math.max(max_area,area);
                area = 0;
            }
        }
        return max_area;
    }
}