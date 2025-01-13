class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<len; i++) {
            if(!hm.containsKey(nums[i])) {
                hm.put(nums[i],1);
            } else {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        for(var i : hm.keySet()) {
            if(hm.get(i)>len/2) return i;
        } return 0;
    }
}