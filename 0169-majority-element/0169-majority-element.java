class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            } else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(var i : map.keySet()) {
            if(map.get(i) > len/2) return i;
        } return 0;
    }
}