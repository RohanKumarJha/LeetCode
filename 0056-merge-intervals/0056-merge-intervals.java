class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int row = intervals.length;
        int start=0, end=0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<row; i++) {
            if(i == 0) {
                start = intervals[i][0];
                end = intervals[i][1];
            } else if(intervals[i][0]<=end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                List<Integer> newList = new ArrayList<>();
                newList.add(start);
                newList.add(end);
                list.add(newList);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        List<Integer> newList = new ArrayList<>();
        newList.add(start);
        newList.add(end);
        list.add(newList);

        int[][] array = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            List<Integer> result = list.get(i);
            array[i] = result.stream().mapToInt(Integer::intValue).toArray();
        } return array;
    }
}