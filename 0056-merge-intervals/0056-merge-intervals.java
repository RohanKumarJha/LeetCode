class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int start=intervals[0][0], end=intervals[0][1];
        int pos = 1;
        List<List<Integer>> list = new ArrayList<>();
        while(pos < intervals.length) {
            int firstIndex = intervals[pos][0];
            int secondIndex = intervals[pos][1];
            if(firstIndex <= end) {
                end = Math.max(end, secondIndex);
            } else {
                list.add(Arrays.asList(start,end));
                start = firstIndex;
                end = secondIndex;
            } pos++;
        } list.add(Arrays.asList(start,end));

        int size = list.size();
        int[][] arr = new int[size][2];
        for(int i=0; i<size; i++) {
            arr[i][0] = list.get(i).get(0);
            arr[i][1] = list.get(i).get(1);
        } return arr;
    }
}