class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        int size = grid.length;
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(map.containsKey(grid[i][j])) {
                    result[0] = grid[i][j];
                } else {
                    map.put(grid[i][j],1);
                }
            }
        }
        for(int i=1; i<=size*size; i++) {
            if(!map.containsKey(i)) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}