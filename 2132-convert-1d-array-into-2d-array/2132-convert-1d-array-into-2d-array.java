class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] newArray = new int[m][n];
        int num=0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(m*n == original.length) {
                    newArray[i][j] = original[num];
                    num++;
                } else {
                    return new int[][]{};
                }                
            }
        } return newArray;
    }
}