class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Integer i : map.keySet()) {
            if(map.get(i) > n/3) list.add(i);
        } return list;
    }
}