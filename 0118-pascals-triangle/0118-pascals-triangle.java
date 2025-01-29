class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        list.add(curr);
        curr = new ArrayList<>();
        for(int i=1; i<numRows; i++) {
            curr.add(1);
            for(int j=1; j<i; j++) {
                curr.add(prev.get(j)+prev.get(j-1));
            } 
            curr.add(1);
            prev = curr;
            list.add(curr);
            curr = new ArrayList<>();
        } return list;
    }
}