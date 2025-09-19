class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        int[] arr = new int[grid.length*grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                int elm = grid[i][j];
                if(arr[elm-1] == 1) {
                    result[0] = elm;
                } else {
                    arr[elm-1] = 1;
                }
            } 
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) result[1]=i+1;
        } return result;
    }
}