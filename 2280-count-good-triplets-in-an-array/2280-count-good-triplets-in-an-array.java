import java.util.*;

class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;

        // Map indices of nums2 for quick lookup
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[nums2[i]] = i;
        }

        // Translate nums1 into indices in nums2
        int[] indexArr = new int[n];
        for (int i = 0; i < n; i++) {
            indexArr[i] = pos[nums1[i]];
        }

        // Prefix and suffix counts using Fenwick Tree or similar
        long[] prefixCount = new long[n];
        long[] suffixCount = new long[n];
        FenwickTree prefixTree = new FenwickTree(n);
        FenwickTree suffixTree = new FenwickTree(n);

        // Calculate prefix counts (number of elements smaller before the current index)
        for (int i = 0; i < n; i++) {
            prefixCount[i] = prefixTree.query(indexArr[i] - 1);
            prefixTree.update(indexArr[i], 1);
        }

        // Calculate suffix counts (number of elements larger after the current index)
        for (int i = n - 1; i >= 0; i--) {
            suffixCount[i] = suffixTree.query(n - 1) - suffixTree.query(indexArr[i]);
            suffixTree.update(indexArr[i], 1);
        }

        // Calculate good triplets count
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += prefixCount[i] * suffixCount[i];
        }

        return result;
    }

    // Fenwick Tree (or Binary Indexed Tree) for efficient prefix/suffix operations
    class FenwickTree {
        private long[] tree;

        public FenwickTree(int size) {
            tree = new long[size + 1];
        }

        public void update(int index, long value) {
            for (int i = index + 1; i < tree.length; i += (i & -i)) {
                tree[i] += value;
            }
        }

        public long query(int index) {
            long sum = 0;
            for (int i = index + 1; i > 0; i -= (i & -i)) {
                sum += tree[i];
            }
            return sum;
        }
    }
}
