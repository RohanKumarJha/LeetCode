class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(prev));
        for(int i=1; i<numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1; j<i; j++) {
                int sum = prev.get(j) + prev.get(j-1);
                curr.add(sum);
            }
            curr.add(1);
            result.add(new ArrayList<>(curr));
            prev = curr;
        }
        return result;
    }
}