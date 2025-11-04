class Solution {
    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void permut(int[] nums,int index,List<List<Integer>> result) {
        if(index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int i : nums) list.add(i);
            result.add(list);
            return ;
        }
        for(int i=index; i<nums.length; i++) {
            swap(nums,index,i);
            permut(nums,index+1,result);
            swap(nums,index,i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permut(nums,0,result);
        return result;
    }
}