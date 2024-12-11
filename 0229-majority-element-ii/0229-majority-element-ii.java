class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i])+1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        for(int key : hm.keySet()) {
            if(hm.get(key) > n/3) list.add(key);
        } return list;
    }
}