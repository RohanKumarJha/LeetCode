class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int row=grid.length, col=grid[0].length;
        int[] result = new int[2];

        int[] arr = new int[row*col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(arr[grid[i][j]-1] == 0) {
                    arr[grid[i][j]-1]++;
                } else if(arr[grid[i][j]-1] == 1) {
                    result[0] = grid[i][j];
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) result[1]=i+1;
        } return result;
    }
}