class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(set.contains(grid[i][j])) {
                    arr[0] = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }
        for(int i=0; i<grid.length*grid.length; i++) {
            if(!set.contains(i+1)) {
                arr[1] = i+1;
                return arr;
            }
        }
        return arr;
    }
}