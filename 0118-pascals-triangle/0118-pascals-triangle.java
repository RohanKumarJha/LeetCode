class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        if(numRows==0) return result;
        firstRow.add(1);
        result.add(firstRow);
        for(int i=1; i<numRows; i++) {
            List<Integer> lastRow = result.get(i-1);
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j=1; j<i; j++) {
                curRow.add(lastRow.get(j-1)+lastRow.get(j));
            }
            curRow.add(1);
            result.add(curRow);
        } return result;
    }
}