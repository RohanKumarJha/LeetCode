class Solution {
    public int numSpecial(int[][] mat) {
        int R = mat.length, C = mat[0].length;
        int[] row = new int[R];
        int[] col = new int[C];
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }

        int count = 0;
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                if(mat[i][j]==1 && row[i]==1 && col[j]==1) {
                    count++;
                }
            }
        } return count;
    }
}