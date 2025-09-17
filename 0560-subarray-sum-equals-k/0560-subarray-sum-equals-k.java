class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0 ;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i : nums) {
            sum += i;
            result += map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        } return result;
    }
}