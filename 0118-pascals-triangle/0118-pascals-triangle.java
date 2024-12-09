class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        if(n == 0) return ans;
        firstRow.add(1);
        ans.add(firstRow);
        for(int i=1; i<n; i++) {
            List<Integer> preRow = ans.get(i-1);
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j=1; j<i; j++) {
                curRow.add(preRow.get(j-1)+preRow.get(j));
            } curRow.add(1);
            ans.add(curRow);
        } return ans;
    }
}