class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0] <= end) {
                end = Math.max(end,intervals[i][1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);
                result.add(new ArrayList<>(list));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(start);
        list.add(end);
        result.add(new ArrayList<>(list));

        int[][] array = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            array[i][0] = result.get(i).get(0);
            array[i][1] = result.get(i).get(1);
        }

        return array;
    }
}