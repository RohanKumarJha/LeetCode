class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        int[] arr = new int[2];
        for(int num=1; num<=len*len; num++) {
            int count = 0;
            for(int i=0; i<len; i++) {
                for(int j=0; j<len; j++) {
                    if(grid[i][j] == num) count++;
                }
            }
            if(count == 2) arr[0]=num;
            if(count == 0) arr[1]=num;
        } return arr;
    }
}