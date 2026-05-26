class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int result = 0;
        while(left < right) {
            int min_val = Math.min(height[left], height[right]);
            result = Math.max(result, min_val*(right-left));
            if(height[left] < height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return result;
    }
}