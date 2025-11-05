class Solution {
    public void comb(int[] nums,int k,int index,List<Integer> list,List<List<Integer>> result) {
        if(list.size() == k) {
            result.add(new ArrayList<>(list));
            return ;
        }
        if(index == nums.length) return ;
        list.add(nums[index]);
        comb(nums,k,index+1,list,result);
        list.remove(list.size()-1);
        comb(nums,k,index+1,list,result);
    }

    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        int count = 1;
        for(int i=0; i<n; i++) {
            nums[i] = count;
            count++;
        }
        List<List<Integer>> result = new ArrayList<>();
        comb(nums,k,0,new ArrayList<>(),result);
        return result;
    }
}