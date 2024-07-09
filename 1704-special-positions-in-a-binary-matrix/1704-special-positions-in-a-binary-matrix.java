class Solution {
    public int numSpecial(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;
        int[] rowArr = new int[R];
        int[] colArr = new int[C];

        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                rowArr[i] += mat[i][j];
                colArr[j] += mat[i][j];
            }
        }

        int count=0;
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                if(mat[i][j]==1 && rowArr[i]==1 && colArr[j]==1) {
                    count++;
                }
            }
        } return count;
    }
}