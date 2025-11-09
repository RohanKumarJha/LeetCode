class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        List<Integer> currentList = new ArrayList<>();
        currentList.add(1);
        result.add(currentList);
        List<Integer> prevList = new ArrayList<>();
        prevList = currentList;
        for(int i=1; i<numRows; i++) {
            currentList = new ArrayList<>();
            currentList.add(1);
            for(int j=1; j<i; j++) {
                currentList.add(prevList.get(j-1)+prevList.get(j));
            }
            currentList.add(1);
            result.add(currentList);
            prevList = currentList;
        } return result;
    }
}