import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort to handle duplicates
        generateSubsets(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private void generateSubsets(List<List<Integer>> result, List<Integer> current, int[] nums, int start) {
        result.add(new ArrayList<>(current)); // Add the current subset
        
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]); // Include nums[i]
            generateSubsets(result, current, nums, i + 1); // Recurse
            current.remove(current.size() - 1); // Backtrack
        }
    }
}
