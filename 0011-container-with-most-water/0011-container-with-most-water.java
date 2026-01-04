class Solution {
    public int maxArea(int[] height) {
        int size = height.length;
        int result = 0;
        int width = size-1;
        int start=0, end=size-1;
        while(start < end) {
            result = Math.max(result, Math.min(height[start],height[end])*width);
            if(height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
            width--;
        }
        return result;
    }
}