class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int start=intervals[0][0], end=intervals[0][1];
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1; i<intervals.length; i++) {
            List<Integer> list = new ArrayList<>();
            if(intervals[i][0] <= end) {
                end = Math.max(end,intervals[i][1]);
            } else {
                list.add(start);
                list.add(end);
                result.add(list);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(Arrays.asList(start, end));
        int[][] arr = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> row = result.get(i);
            arr[i] = row.stream().mapToInt(Integer::intValue).toArray();
        } return arr;
    }
}