class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int size = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<size-3; i++) {
            if(nums[i] > target && nums[i]>0) break;
            for(int j=i+1; j<size-2; j++) {
                int k=j+1, l=size-1;
                while(k < l) {
                    if(nums[i]+nums[j]+nums[k]+nums[l] == target) {
                        set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++; l--;
                    } else if(nums[i]+nums[j]+nums[k]+nums[l] < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        } return new ArrayList<>(set);
    }
}