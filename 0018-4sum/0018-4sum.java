class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int size = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<size-3; i++) {
            for(int j=i+1; j<size-2; j++) {
                int k=j+1, l=size-1;
                while(k < l) {
                    long sum = (long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                    if(sum == (long)target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        set.add(list);
                        k++; l--;
                    } else if(sum < (long)target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(set);
        return result;
    }
}