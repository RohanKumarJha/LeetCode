class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int val : map.keySet()) {
            if(map.get(val) > n/3) {
                arr.add(val);
            }
        } return arr;
    }
}