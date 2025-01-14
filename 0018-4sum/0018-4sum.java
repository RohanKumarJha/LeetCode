class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<len-3; i++) {
            for(int j=i+1; j<len-2; j++) {
                int k=j+1, l=len-1;
                while(k < l) {
                    List<Integer> list = new ArrayList<>();
                    long sum = (long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                    if(sum == target) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        set.add(list);
                        k++; l--;
                    } else if(sum < target) k++;
                    else l--;
                }
            }
        } result.addAll(set);
        return result;
    }
}