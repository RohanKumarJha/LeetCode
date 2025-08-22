class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) return list;

        List<Integer> preRow = new ArrayList<>();
        preRow.add(1);
        list.add(preRow);
        if(numRows == 1) return list;

        for(int i=1; i<numRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j=2; j<=i; j++) {
                currRow.add(preRow.get(j-1)+preRow.get(j-2));
            }
            currRow.add(1);
            list.add(currRow);
            preRow = currRow;
        } return list;
    }
}