class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        int row = 1;
        while(row < intervals.length) {
            if(intervals[row][0] <= end) {
                end = Math.max(end,intervals[row][1]);
            } else {
                result.add(new ArrayList<>(Arrays.asList(start,end)));
                start = intervals[row][0];
                end = intervals[row][1];
            } row++;
        }
        result.add(new ArrayList<>(Arrays.asList(start, end)));

        int[][] array = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            array[i][0] = result.get(i).get(0);
            array[i][1] = result.get(i).get(1);
        }

        return array;

    }
}