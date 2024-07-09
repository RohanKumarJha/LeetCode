class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] newArr = new int[m][n];
        int value = 0;
        for(int i=0; i<m; i++) {
            if(original.length != m*n) {
                return new int[][]{};
            }
            for(int j=0; j<n; j++) {
                newArr[i][j] = original[value];
                value++;
            }
        } return newArr;
    }
}