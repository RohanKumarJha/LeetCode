class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
        }
        for(var e : map.keySet()) {
            if(map.get(e) > n/3) {
                list.add(e);
            }
        } return list;
    }
}