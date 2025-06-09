class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;  // Stores count of valid subarrays
        int sum = 0;  // Stores the cumulative prefix sum
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        
        // Base case: A sum of 0 is seen once to handle cases where sum == k
        prefixSumFreq.put(0, 1);

        // Iterate through the array
        for (int num : nums) {
            sum += num;  // Update prefix sum
            
            // Check if (sum - k) exists in the map
            // This means there is a previous prefix sum where removing it gets exactly k
            if (prefixSumFreq.containsKey(sum - k)) {
                result += prefixSumFreq.get(sum - k);
            }
            
            // Store the frequency of the current prefix sum
            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }
        
        return result;  // Return total valid subarray count
    }
}
