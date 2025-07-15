class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;
    }

    private void backtrack(int[] nums, int idx, List<List<Integer>> res) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(Arrays.stream(nums).boxed().toList()));
            return;
        }

        // Helper function to simulate looping
        recursiveSwap(nums, idx, idx, res);
    }

    private void recursiveSwap(int[] nums, int idx, int i, List<List<Integer>> res) {
        if (i == nums.length) return;

        swap(nums, idx, i);
        backtrack(nums, idx + 1, res);
        swap(nums, idx, i); // backtrack

        recursiveSwap(nums, idx, i + 1, res); // next swap candidate
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i]; nums[i] = nums[j]; nums[j] = temp;
    }
}
