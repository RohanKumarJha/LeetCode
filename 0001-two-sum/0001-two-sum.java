class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(mp.containsKey(target-nums[i])) {
                arr[0] = mp.get(target-nums[i]);
                arr[1] = i;
                break;
            } else {
                mp.put(nums[i],i);
            }
        } return arr;
    }
}