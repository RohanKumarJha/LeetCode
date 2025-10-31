import java.util.*;

class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void permut(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            result.add(temp);
            return;
        }

        Set<Integer> used = new HashSet<>(); // to track duplicates at this recursion depth

        for (int i = index; i < nums.length; i++) {
            // Skip duplicates
            if (used.contains(nums[i])) continue;
            used.add(nums[i]);

            swap(nums, i, index);
            permut(nums, index + 1, result);
            swap(nums, i, index); // backtrack
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums); // sort to group duplicates
        List<List<Integer>> result = new ArrayList<>();
        permut(nums, 0, result);
        return result;
    }
}
