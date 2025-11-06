class Solution {
    private void comb(int n,int k,int index,List<Integer> list,List<List<Integer>> result) {
        if(list.size() == k) {
            result.add(new ArrayList<>(list));
            return ;
        }
        if(index > n) return;
        list.add(index);
        comb(n,k,index+1,list,result);
        list.remove(list.size()-1);
        comb(n,k,index+1,list,result);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        comb(n,k,1,new ArrayList<>(),result);
        return result;
    }
}