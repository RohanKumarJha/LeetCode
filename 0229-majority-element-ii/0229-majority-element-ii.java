class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(var num : nums) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }
        for(var i : map.keySet()) {
            if(map.get(i) > len/3) result.add(i);
        } return result;
    }
}