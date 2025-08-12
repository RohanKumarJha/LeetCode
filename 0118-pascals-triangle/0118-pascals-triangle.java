class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) return list;

        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        list.add(prevRow);

        for(int i=1; i<numRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j=1; j<i; j++) {
                int result = prevRow.get(j)+prevRow.get(j-1);
                currRow.add(result);
            } currRow.add(1);
            list.add(currRow);
            prevRow = currRow;
        }
        return list;
    }
}