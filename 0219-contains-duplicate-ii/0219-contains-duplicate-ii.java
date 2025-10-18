class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k <= 0) return false;
        int start=0, end=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(end < nums.length) {
            if(end-start <= k) {
                if(map.containsKey(nums[end])) return true;
                map.put(nums[end],end);
                end++;
            } else {
                map.remove(nums[start]);
                start++;
            }
        } return false;
    }
}