class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if(n == 0) return ans;
        List<Integer> firstRow = new ArrayList<>();
        List<Integer> preRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        preRow = firstRow;
        for(int i=1; i<n; i++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j=1; j<i; j++) {
                currRow.add(preRow.get(j)+preRow.get(j-1));
            } currRow.add(1);
            preRow = currRow;
            ans.add(currRow);
        } return ans;
    }
}