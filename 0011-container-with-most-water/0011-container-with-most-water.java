class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int start=0, end=height.length-1;
        while(start < end) {
            result = Math.max(result,Math.min(height[end],height[start])*(end-start));
            if(height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        } return result;
    }
}