import java.util.*;

class Solution {
    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void permutation(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            permutation(nums, index + 1, result);
            swap(nums, i, index); // backtrack
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums, 0, result);
        return result;
    }
}
