class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<List<Integer>> twodList = new ArrayList<>();
        int start=intervals[0][0], end=intervals[0][1];
        for(int i=0; i<intervals.length; i++) {
            if(end >= intervals[i][0]) {
                end = Math.max(end, intervals[i][1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);
                twodList.add(list);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(start);
        list.add(end);
        twodList.add(list);

        int[][] array = new int[twodList.size()][twodList.get(0).size()];
        for (int i = 0; i < twodList.size(); i++) {
            List<Integer> row = twodList.get(i);
            for (int j = 0; j < row.size(); j++) {
                array[i][j] = row.get(j);
            }
        } return array;
    }
}