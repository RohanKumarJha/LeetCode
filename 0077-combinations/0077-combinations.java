class Solution {
    public void combination(int n,int k, int index,List<Integer> list,List<List<Integer>> result) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (index > n) return;
        list.add(index);
        combination(n,k,index+1,list,result);
        list.remove(list.size()-1);
        combination(n,k,index+1,list,result);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combination(n,k,1,new ArrayList<>(),result);
        return result;
    }
}