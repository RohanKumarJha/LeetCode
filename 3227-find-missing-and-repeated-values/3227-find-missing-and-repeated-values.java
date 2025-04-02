class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        boolean[] flag = new boolean[len*len+1];
        int repeated=0, notOccur=0;
        int count = 0;
        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {
                if(flag[grid[i][j]] == true) {
                    repeated = grid[i][j];
                } else {
                    flag[grid[i][j]]=true;
                } count++;
            }
        }
        for(int i=1; i<=len*len; i++) {
            if(!flag[i]) {
                notOccur = i;
                break;
            }
        } return new int[]{repeated,notOccur};
    }
}