class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        int[] arr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {
                if(map.containsKey(grid[i][j])) {
                    map.put(grid[i][j],(map.get(grid[i][j]))+1);
                } else {
                    map.put(grid[i][j],1);
                }
            }
        }
        for(int i=1; i<=len*len; i++) {
            if(!map.containsKey(i)) {
                arr[1]=i;
            } else if(map.get(i)==2) {
                arr[0]=i;
            }
        }
        return arr;
    }
}