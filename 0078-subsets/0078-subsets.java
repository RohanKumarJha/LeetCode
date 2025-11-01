class Solution {
    public static void Helper(int[]nums,List<List<Integer>> ls,List<Integer> l,int ind){
        if(ind==nums.length){
            ls.add(new ArrayList<>(l));
            return ;
        }
        l.add(nums[ind]);
        Helper(nums,ls,l,ind+1);
        l.remove(l.size()-1);
        Helper(nums,ls,l,ind+1);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        Helper(nums,ls,l,0);
        return ls;
    }
}