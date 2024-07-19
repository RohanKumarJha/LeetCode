class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // For left array
        int leftMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            leftMax = Math.max(leftMax, height[i]);
            left[i] = leftMax;
        }

        // For right array
        int rightMax = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--) {
            rightMax = Math.max(rightMax, height[i]);
            right[i] = rightMax;
        }

        int total = 0;
        for(int i=0; i<n; i++) {
            total += (Math.min(left[i], right[i]) - height[i]);
        } return total;
    }
}