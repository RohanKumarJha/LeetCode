class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len  =nums.length;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++) {
            int elm = nums[i];
            if(map.containsKey(target-elm)) {
                result[0] = map.get(target-elm);
                result[1] = i;
                break;
            } else {
                map.put(elm,i);
            }
        } return result;
    }
}