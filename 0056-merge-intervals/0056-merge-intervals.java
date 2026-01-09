class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int first = intervals[0][0];
        int last = intervals[0][1];
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0] <= last) {
                last = Math.max(last,intervals[i][1]);
            } else {
                result.add(Arrays.asList(first,last));
                first = intervals[i][0];
                last = intervals[i][1];
            }
        }
        result.add(Arrays.asList(first,last));

        int[][] arr = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            arr[i][0] = result.get(i).get(0);
            arr[i][1] = result.get(i).get(1);
        }

        return arr;

    }
}