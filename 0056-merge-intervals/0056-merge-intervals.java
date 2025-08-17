class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        if(intervals.length==0) return intervals;

        List<List<Integer>> list = new ArrayList<>();
        int start=intervals[0][0], end=intervals[0][1];
        for(int i=1; i<intervals.length; i++) {
            if(end < intervals[i][0]) {
                list.add(Arrays.asList(start,end));
                start = intervals[i][0];
                end = intervals[i][1];
            } else {
                end = Math.max(end,intervals[i][1]);
            }
        } list.add(Arrays.asList(start, end));

        int[][] result = new int[list.size()][2];
        for(int i=0; i<result.length; i++) {
            result[i][0] = list.get(i).get(0);
            result[i][1] = list.get(i).get(1);
        }
        return result;

    }
}