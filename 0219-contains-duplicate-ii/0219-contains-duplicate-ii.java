class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k <= 0) return false;
        int start=0, end=0;
        Set<Integer> set = new HashSet<>();
        while(end < nums.length) {
            if(end-start <= k) {
                if(set.contains(nums[end])) return true;
                set.add(nums[end]);
                end++;
            } else {
                set.remove(nums[start]);
                start++;
            }
        } return false;
    }
}