class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));
        int count = 0;
        int i=0, j=1;
        while(j < n) {
            
            int cs = intervals[i][0];
            int ce = intervals[i][1];

            int ns = intervals[j][0];
            int ne = intervals[j][1];

            if(ce > ns) {
                if(ne > ce) {
                    j += 1;
                    count += 1;
                } else {
                    i = j;
                    j += 1;
                    count += 1;
                }
            } else {
                i = j;
                j += 1;
            }
        } return count;
    }
}