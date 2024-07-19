class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // For left array
        int leftVal = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            leftVal = Math.max(leftVal, height[i]);
            left[i] = leftVal;
        }

        // For right array
        int rightVal = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--) {
            rightVal = Math.max(rightVal, height[i]);
            right[i] = rightVal;
        }

        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += (Math.min(left[i], right[i]) - height[i]);
        } return sum;
    }
}