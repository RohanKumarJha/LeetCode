class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int first=0; first<len-3; first++) {
            if(nums[first] > target && nums[first]>0) break;
            for(int second=first+1; second<len-2; second++) {
                int third=second+1, fourth=len-1;
                while(third < fourth) {
                    if(nums[first]+nums[second]+nums[third]+nums[fourth] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        list.add(nums[fourth]);
                        set.add(list);
                        third++; fourth--;
                    } else if(nums[first]+nums[second]+nums[third]+nums[fourth] < target) {
                        third++;
                    } else {
                        fourth--;
                    }
                }
            }
        } return new ArrayList<>(set);
    }
}