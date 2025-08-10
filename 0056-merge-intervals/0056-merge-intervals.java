class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int start=intervals[0][0], end=intervals[0][1];

        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<len; i++) {
            if(intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                List<Integer> li = Arrays.asList(start, end);
                list.add(li);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        List<Integer> li = Arrays.asList(start, end);
        list.add(li);
        int[][] array2D = list.stream()
                            .map(row -> row.stream().mapToInt(Integer::intValue).toArray())
                            .toArray(int[][]::new);
        return array2D;
    }
}