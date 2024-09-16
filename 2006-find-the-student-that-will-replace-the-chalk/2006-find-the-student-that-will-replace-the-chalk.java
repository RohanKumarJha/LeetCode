class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        int n = chalk.length;
        for(int i=0; i<n; i++) {
            totalChalk += chalk[i];
        }
        int answer = (int)(k % totalChalk);
        for(int i=0; i<n; i++) {
            if(answer >= chalk[i]) {
                answer -= chalk[i];
            } else {
                return i;
            }
        } return 0;
    }
}