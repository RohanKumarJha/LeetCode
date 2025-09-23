class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int[] right = new int[size];
        int maxValue = Integer.MIN_VALUE;
        maxValue = Integer.MIN_VALUE;
        for(int i=size-1; i>=0; i--) {
            maxValue = Math.max(maxValue,height[i]);
            right[i] = maxValue;
        }

        int result = 0;
        maxValue = Integer.MIN_VALUE;
        for(int i=0; i<size; i++) {
            maxValue = Math.max(maxValue,height[i]);
            int minValue = Math.min(maxValue,right[i]);
            result += (minValue-height[i]);
        } return result;
    }
}