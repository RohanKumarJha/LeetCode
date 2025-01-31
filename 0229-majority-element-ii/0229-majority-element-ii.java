class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(var e : map.keySet()) {
            if(map.get(e) > n/3) {
                list.add(e);
            }
        } return list;
    }
}