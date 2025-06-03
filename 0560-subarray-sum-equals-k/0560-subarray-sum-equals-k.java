import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Handles the case when sum itself is k

        for (int num : nums) {
            sum += num;
            result += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
