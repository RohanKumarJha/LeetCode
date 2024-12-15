class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        list.add(firstRow);
        List<Integer> preRow = new ArrayList<>();
        preRow = firstRow;
        for(int i=1; i<numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j=1; j<i; j++) {
                curRow.add(preRow.get(j)+preRow.get(j-1));
            }
            curRow.add(1);
            preRow = curRow;
            list.add(curRow);
        } return list;
    }
}