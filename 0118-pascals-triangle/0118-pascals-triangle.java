class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) return list;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        list.add(firstRow);
        if(numRows == 1) return list;
        for(int i=1; i<numRows; i++) {
            List<Integer> prev = list.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1; j<i; j++) {
                curr.add(prev.get(j)+prev.get(j-1));
            } curr.add(1);
            list.add(curr);
        } return list;
    }
}