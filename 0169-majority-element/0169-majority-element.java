class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<size; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
            if(map.get(nums[i]) > size/2) return nums[i];
        } return 0;
    }
}