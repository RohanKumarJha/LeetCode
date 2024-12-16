class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            } else {
                hashMap.put(nums[i],1);
            }
        }
        for(int i : hashMap.keySet()) {
            if(hashMap.get(i) > n/2) return i;
        } return 0;
    }
}