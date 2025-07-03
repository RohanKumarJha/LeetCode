class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(var val : map.keySet()) {
            if(map.get(val) > n/3) {
                list.add(val);
            }
        } return list;
    }
}