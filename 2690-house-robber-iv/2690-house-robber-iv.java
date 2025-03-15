import java.util.*;

class Solution {
    public boolean check(long mid, int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid) {
                count++;
                i++; // Skip the next element
            }
            if (count >= k) return true;
        }
        return false;
    }

    public int minCapability(int[] nums, int k) {
        long left = Arrays.stream(nums).min().getAsInt(); // O(N)
        long right = Arrays.stream(nums).max().getAsInt(); // O(N)

        // Binary search on the range
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (check(mid, nums, k)) { // O(N)
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return (int) left;
    }
}
