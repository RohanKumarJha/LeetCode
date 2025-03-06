class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        int row = grid.length;
        for(int i=0; i<row; i++) {
            for(int j=0; j<row; j++) {
                if(map.containsKey(grid[i][j])) {
                    map.put(grid[i][j],map.get(grid[i][j])+1);
                    arr[0] = grid[i][j];
                } else {
                    map.put(grid[i][j],1);
                }
            }
        }
        for(int i=1; i<=row*row; i++) {
            if(!map.containsKey(i)) {
                arr[1] = i;
            }
        } return arr;
    }
}