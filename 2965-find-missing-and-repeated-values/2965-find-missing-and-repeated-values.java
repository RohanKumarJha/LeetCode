class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length * grid.length;
        int[] arr = new int[size];
        int pointer = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid.length; j++) {
                arr[pointer++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        
        int[] result = new int[2];

        // Find duplicate
        for(int i=1; i<size; i++) {
            if(arr[i] == arr[i-1]) {
                result[0] = arr[i];
                break;
            }
        }

        // Find missing
        pointer = 1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == pointer) pointer++;
        }

        result[1] = pointer;

        return result;
    }
}